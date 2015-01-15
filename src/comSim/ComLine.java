package comSim;

import java.util.Random;

public class ComLine {
	private int width;
	private Regiment[] frontRow, backRow;
	private General general;
	private int roll;
	private Random r;

	public ComLine (General general, Technology technology, int width, int inf, Model infModel, int cav, Model cavModel, int art, Model artModel){
		if (inf + cav > width) {
			throw new RuntimeException("Not enough width");
		}
		if (technology.getLevel() < 7){
			art = 0;
		}
		this.general = general;
		this.width =  width;
		frontRow = new Regiment[width];
		backRow = new Regiment[width];
		r = new Random();
		for (int i = 0; i < width; i++){
			if (i < (width - inf - cav) / 2){
				frontRow[i] = new NoRegiment();
			}
			else if (i < (width - inf) / 2){
				frontRow[i] = new Cavalry(technology, cavModel);
			}
			else if (i < (width + inf) / 2){
				frontRow[i] = new Infantry(technology, infModel);
			}
			else if (i < (width + inf + cav) / 2){
				frontRow[i] = new Cavalry(technology, cavModel);
			}
			else{
				frontRow[i] = new NoRegiment();
			}
		}
		for (int i = 0; i < width; i++){
			if (i < (width - art) / 2){
				backRow[i] = new NoRegiment();
			}
			else if (i < (width + art) / 2){
				backRow[i] = new Artillery(technology, artModel);
			}
			else{
				backRow[i] = new NoRegiment();
			}
		}
	}
	public int getWidth(){
		return width;
	}
	public Regiment getFrontRegiment(int i){
		return frontRow[i];
	}
	public Regiment getBackRegiment(int i){
		return backRow[i];
	}
	public int getArmyStrength(){
		int armyStrength = 0;
		for (int i = 0; i < width; i++){
			armyStrength += frontRow[i].getStrength();
			armyStrength += backRow[i].getStrength();
		}
		return armyStrength;
	}
	public boolean defeated(){
		boolean defeated = true;
		for (int i = 0; i < width; i++){
			if (frontRow[i].getCurrentMorale() > 0.0 || backRow[i].getCurrentMorale() > 0.0){
				defeated = false;
				break;
			}
		}
		return defeated;
	}
	public General getGeneral() {
		return general;
	}
	public void setGeneral(General general) {
		this.general = general;
	}
	public void roll(int roll){
		this.roll = roll;
	}
	public void roll(){
		this.roll = r.nextInt(10);
	}
	public int getRoll(){
		return roll;
	}
	public void wipeAllCasualties(){
		for (int i = 0; i < width; i++){
			frontRow[i].wipeCasualties();
			backRow[i].wipeCasualties();
		}
	}
	public void consolidate(){
		outerloop: for (int i = width / 2 - 1; i >= 0 ; i--){
			if (frontRow[i].getCurrentMorale() == 0){
				for(int j = i-1; j >= 0; j--){
					if (frontRow[j].getCurrentMorale() > 0){
						frontRow[i] = frontRow[j];
						frontRow[j] = new NoRegiment();
						continue outerloop;
					}
				}
				if (backRow[i].getCurrentMorale() > 0){
					frontRow[i] = backRow[i];
					frontRow[i].toFrontRow();
					backRow[i] = new NoRegiment();
				}
			}
		}
		outerloop: for (int i = width / 2 ; i < width; i++){
			if (frontRow[i].getCurrentMorale() == 0){
				for(int j = i+1; j < width; j++){
					if (frontRow[j].getCurrentMorale() > 0){
						frontRow[i] = frontRow[j];
						frontRow[j] = new NoRegiment();
						continue outerloop;
					}
				}
				if (backRow[i].getCurrentMorale() > 0){
					frontRow[i] = backRow[i];
					frontRow[i].toFrontRow();
					backRow[i] = new NoRegiment();
				}
			}
		}
		for (int i = 0; i < width ; i++){
			if (frontRow[i].getCurrentMorale() == 0){
				frontRow[i] = new NoRegiment();
			}
			if (backRow[i].getCurrentMorale() == 0){
				backRow[i] = new NoRegiment();
			}
		}

	}

	public void print(){
		print(false);
	}
	public void print(boolean reverse){
		if (!reverse){
			for (int i = 0; i < width; i++){
				System.out.print(frontRow[i] + "\t");
			}
			System.out.print("= " + getArmyStrength());
			System.out.println();
			for (int i = 0; i < width; i++){
				System.out.print(backRow[i] + "\t");
			}
			System.out.println();
			
			for (int i = 0; i < width; i++){
				System.out.format("%.2f%s\t", frontRow[i].getCurrentMorale(), frontRow[i].id());
			}
			System.out.println();
			for (int i = 0; i < width; i++){
				System.out.format("%.2f%s\t", backRow[i].getCurrentMorale(), backRow[i].id());
			}
			System.out.println();
			
		}
		else{
			for (int i = 0; i < width; i++){
				System.out.format("%.2f%s\t", backRow[i].getCurrentMorale(), backRow[i].id());
			}
			System.out.println();
			for (int i = 0; i < width; i++){
				System.out.format("%.2f%s\t", frontRow[i].getCurrentMorale(), frontRow[i].id());
			}
			System.out.println();
			for (int i = 0; i < width; i++){
				System.out.print(backRow[i] + "\t");
			}
			System.out.println();
			for (int i = 0; i < width; i++){
				System.out.print(frontRow[i] + "\t");
			}
			System.out.print("= " + getArmyStrength());

			System.out.println();
		}
	}
}