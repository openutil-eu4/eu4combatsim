package comSim;

public abstract class Regiment {
	private int strength;
	private Technology technology;
	private int maneuver;
	private Model model;
	private double currentMorale;
	private int bufferedCasualties;
	private double bufferedMorale;
	private boolean backRow;
	
	/*                              -2, -1,  0,  1,  2,  3,  4,  5,  6,  7,  8,  9, 10,  11,  12,  13*/
	int[] casualtyTable = new int[] {4,  8, 12, 16, 20, 24, 32, 40, 50, 60, 70, 80, 90, 100, 110, 120};  //TODO Wiki difference
	public Regiment(Technology technology, int strength, int maneuver, Model model, boolean backRow) {
		this.technology = technology;
		this.strength = strength;
		this.maneuver = maneuver;
		this.model = model;
		currentMorale = technology.getMorale();
		bufferedCasualties = 0;
		bufferedMorale = 0;
		this.backRow = backRow;
	}
	
	abstract double getCombatModifier(int phase);
	abstract String id();
	
	private int findTarget (ComLine target, int i, int maneuver) throws NoValidTargetException{
		for (int flanking = 0; flanking <= maneuver; flanking++){
			if (0 <= i-flanking){
				if (target.getFrontRegiment(i-flanking).getStrength() > 0){
					return i-flanking;
				}
			}
			if (i+flanking < target.getWidth()){
				if (target.getFrontRegiment(i+flanking).getStrength() > 0){
					return i+flanking;
				}
			}
		}
		throw new NoValidTargetException();
	}
	public void attack(int i, int phase, ComLine attacker, ComLine defender){
		int pips = attacker.getRoll();
		try {
			int target = findTarget(defender, i, getManeuver());
			if (attacker.getGeneral().getPhasePips(phase) > defender.getGeneral().getPhasePips(phase)){
				pips +=  attacker.getGeneral().getPhasePips(phase) - defender.getGeneral().getPhasePips(phase);
			}
			pips += getPips(phase, 0);
			pips -= defender.getFrontRegiment(target).getPips(phase, 1);
			pips -= defender.getBackRegiment(target).getPips(phase, 1) / 2;
			defender.getFrontRegiment(target).storeCasualties((int)(dealCasualties(pips, phase) / defender.getFrontRegiment(target).getTechnology().getTactics()));
		} catch (NoValidTargetException e) {
			;
		}
	}
	public void attackMorale(int i, int phase, ComLine attacker, ComLine defender){
		int pips = attacker.getRoll();
		try {
			int target = findTarget(defender, i, getManeuver());
			if (attacker.getGeneral().getPhasePips(phase) > defender.getGeneral().getPhasePips(phase)){
				pips +=  attacker.getGeneral().getPhasePips(phase) - defender.getGeneral().getPhasePips(phase);
			}
			pips += getPips(2, 0);
			pips -= defender.getFrontRegiment(target).getPips(2, 1);
			pips -= defender.getBackRegiment(target).getPips(2, 1) / 2;
			defender.getFrontRegiment(target).storeMorale(dealMorale(pips, phase) / defender.getFrontRegiment(target).getTechnology().getTactics());
			if (i == target){
				defender.getBackRegiment(target).storeMorale(dealMorale(pips, phase) / defender.getBackRegiment(target).getTechnology().getTactics());
			}
		} catch (NoValidTargetException e) {
			;
		}
	}

	public int dealCasualties(int roll, int phase){
		int baseCasualties, casualties;
		if (roll < -2) roll = -2;
		if (roll > 13) roll = 13;
		roll += 2;
		baseCasualties = casualtyTable[roll];
		casualties = (int) ((baseCasualties * strength) * getCombatModifier(phase) * model.getCombatAbility() * technology.getDiscipline() / 1000.0);
		return casualties;
	}
	
	public double dealMorale(int roll, int phase){
		return dealCasualties(roll, phase) * 0.01 / 6.0 * technology.getMorale();
	}
	
	public int getStrength(){
		return strength;
	}
	public void applyCasualties (){
		if (strength > bufferedCasualties){
			strength -= bufferedCasualties;
		}
		else{
			strength = 0;
		}
	}
	public void storeCasualties(int casualties){
		bufferedCasualties += casualties;
	}
	public int getBufferedCasualties(){
		return bufferedCasualties;
	}
	public void wipeCasualties(){
		bufferedCasualties = 0;
	}

	public double getCurrentMorale() {
		return currentMorale;
	}

	public void applyMoraleDamage() {
		if (currentMorale > bufferedMorale){
			currentMorale -= bufferedMorale;
		}
		else{
			currentMorale = 0;
		}
		bufferedMorale = 0;
	}
	public void storeMorale(double morale){
		bufferedMorale += morale;
	}

	public Technology getTechnology() {
		return technology;
	}
	public int getManeuver(){
		double flankingMod = 1.0;
		if (strength < 750) flankingMod = 0.75; //TODO Wiki difference
		if (strength < 500) flankingMod = 0.5;
		if (strength < 250) flankingMod = 0.25;
		return (int) (maneuver * technology.getManeuver() * flankingMod);
	}

	public Model getModel() {
		return model;
	}
	public int getPips(int phase, int type){
		return model.getPips(phase, type);
	}
	public boolean isBackRow(){
		return backRow;
	}
	public void toFrontRow(){
		backRow = false;
	}
}
