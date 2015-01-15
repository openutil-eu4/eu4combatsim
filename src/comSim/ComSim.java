package comSim;

public class ComSim implements Runnable{
	private static int width = 10;	// not actual combat width, but simulation width & output *affects speed*
	private static int minLevel = 5;
	private static int maxLevel = 5;	// max 32
	private static int iterations = 1;
	
	private static boolean detailed;
	private int level;
	private int casualtySum, receivedCasualtiesA, receivedCasualtiesB, statA, statB, winsA, winsB, days;
	private ComLine armyA, armyB;
	private double casualtyRatio, chanceToWin;

	private void initialize(){
		General generalA = new General(0, 0, 0, 0, 0);  // Fire, Shock, (Maneuver), (Siege), Tradition
		General generalB = new General(0, 0, 0, 0, 0);
		
		Technology technologyA = new Technology(level + 0, 1.0, 1.0); // level, Discipline, Morale Bonus
		Technology technologyB = new Technology(level + 0, 1.0, 1.0);
		
		Model infA = new WesternInfantry(technologyA.getLevel(), -1, 1.0); // level, Model (-1 for random), Combat Ability
		Model cavA = new WesternCavalry(technologyA.getLevel(), -1, 1.0);
		Model artA = new WesternArtillery(technologyA.getLevel(), -1, 1.0);
		
		Model infB = new WesternInfantry(technologyB.getLevel(), -1, 1.0);
		Model cavB = new WesternCavalry(technologyB.getLevel(), -1, 1.0);
		Model artB = new WesternArtillery(technologyB.getLevel(), -1, 1.0);
		
		armyA = new ComLine(generalA, technologyA, width,
				6, infA,		// Number of Infantry, Model
				4, cavA,		// Cavalry
				10, artA);		// Artillery
		armyB = new ComLine(generalB, technologyB, width,
				6, infB,
				4, cavB,
				10, artB);
	}

	private void simulate(){		
		if (detailed) print();
		for (int day = 1; day <= 200; day++){
			int phase = (day-1) % 6;
			phase /= 3;
			if (detailed) System.out.print("Day: " + day + " -- Phase: " + phase + " ");
			armyA.roll();  // fudge rolls by submitting a number 0-9
			armyB.roll();
			if (detailed){
				System.out.print("-- Army A rolls: " + armyA.getRoll() + " ");
				System.out.print("-- Army B rolls: " + armyB.getRoll());
				System.out.print(" -- ACasualties: " + receivedCasualtiesA + " -- BCasualties: " + receivedCasualtiesB);
				System.out.format(" -- Ratio: %.2f%n", ((double) receivedCasualtiesB / (double) receivedCasualtiesA));
			}
			
			for (int i = 0; i < width; i++){
				armyA.getFrontRegiment(i).attack(i, phase, armyA, armyB);
				armyA.getBackRegiment(i).attack(i, phase, armyA, armyB);
				armyB.getFrontRegiment(i).attack(i, phase, armyB, armyA);
				armyB.getBackRegiment(i).attack(i, phase, armyB, armyA);
				armyA.getFrontRegiment(i).attackMorale(i, phase, armyA, armyB);
				armyA.getBackRegiment(i).attackMorale(i, phase, armyA, armyB);
				armyB.getFrontRegiment(i).attackMorale(i, phase, armyB, armyA);
				armyB.getBackRegiment(i).attackMorale(i, phase, armyB, armyA);
			}

			for (int i = 0; i < width; i++){
				armyA.getFrontRegiment(i).applyCasualties();
				armyB.getFrontRegiment(i).applyCasualties();
				armyA.getFrontRegiment(i).applyMoraleDamage();
				armyB.getFrontRegiment(i).applyMoraleDamage();
				armyA.getBackRegiment(i).applyMoraleDamage();
				armyB.getBackRegiment(i).applyMoraleDamage();
			}
			casualtySum = 0;
			for (int i = 0; i < width; i++){
				casualtySum += armyA.getFrontRegiment(i).getBufferedCasualties();
				if (detailed) System.out.print(armyA.getFrontRegiment(i).getBufferedCasualties() + "\t");
			}
			if (detailed) System.out.print("= " + casualtySum);
			receivedCasualtiesA += casualtySum;
			if (detailed) System.out.println();
			if (detailed) print();
			casualtySum = 0;
			for (int i = 0; i < width; i++){
				casualtySum += armyB.getFrontRegiment(i).getBufferedCasualties();
				if (detailed) System.out.print(armyB.getFrontRegiment(i).getBufferedCasualties() + "\t");
			}
			if (detailed) System.out.print("= " + casualtySum);
			receivedCasualtiesB += casualtySum;
			if (detailed){
				System.out.println();
				for (int i = 0; i < width+1; i++){
					System.out.print("--------");
				}
				System.out.println();
			}
			armyA.wipeAllCasualties();
			armyB.wipeAllCasualties();

			if (armyB.defeated()){
				if (detailed) System.out.println("Army A wins!");
				winsA++;
				if (armyA.defeated()) winsB++;
				days += day;
				break;
			}
			if (armyA.defeated()){
				if (detailed) System.out.println("Army B wins!");
				winsB++;
				if (armyB.defeated()) winsA++;
				days += day;
				break;
			}
			if (day >= 12){
				armyA.consolidate();
				armyB.consolidate();
			}
		}
	}

	public double getCasualtyRatio() {
		return casualtyRatio;
	}
	public double getChanceToWin() {
		return chanceToWin;
	}
	public int getDays() {
		return days;
	}
	public void print(){
		armyA.print(true);
		armyB.print();
	}
	public static void main(String[] args) {
		if (maxLevel - minLevel == 0 && iterations == 1){
			detailed = true;
		} else {
			detailed = false;
		}
		int procs = Runtime.getRuntime().availableProcessors();
		ComSim[] c;
		Thread[] t;
		
		System.out.println("level\tCasRat\tCtoWin\tavrDays");
		for (int level = minLevel; level <= maxLevel;){
			c = new ComSim[procs];
			t = new Thread[procs];
			for (int i = 0; i < procs && level + i <= maxLevel; i++){
				c[i] = new ComSim(level + i);
				t[i] = new Thread(c[i]);
				t[i].start();
			}
			for (int i = 0; i < procs && level <= maxLevel; i++){
				try {
					t[i].join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.format("%d\t%.3f\t%.1f%%\t%d\n", level, c[i].getCasualtyRatio(), c[i].getChanceToWin()*100.0, c[i].getDays()/iterations);
				level++;
			}
		}
	}
	public ComSim(int level){
		this.level = level;
	}
	public void run(){
		statA = 0;
		statB = 0;
		winsA = 0;
		winsB = 0;
		days = 0;
		for (int i = 0; i<iterations; i++){
			receivedCasualtiesA = 0;
			receivedCasualtiesB = 0;
			initialize();
			simulate();
			statA += receivedCasualtiesA;
			statB += receivedCasualtiesB;
		}
		casualtyRatio = (double)statB / (double)statA;
		chanceToWin = (double)winsA / (double)(winsB+winsA);
	}
}
