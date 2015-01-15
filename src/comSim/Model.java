package comSim;

import java.util.Random;

public abstract class Model {
	private int level;
	private int model;
	private String[] name;
	private int[] levelAvail;
	private int[][] pips;
	private double combatAbility;
	public Model(int level, int model, double combatAbility, String[] name, int[] levelAvail, int[][] pips){
		this.level = level;
		this.combatAbility = combatAbility;
		this.name = name;
		this.levelAvail = levelAvail;
		this.pips = pips;
		Random r = new Random();
		int match=0, count=0;
		if (model == -1){
			for (int i = levelAvail.length-1; i >= 0; i--){
				if (levelAvail[i] <= level){
					if (match == 0) match = i;
				}
				if (levelAvail[i] == levelAvail[match]){
					count++;
				}
				if (levelAvail[i] < levelAvail[match]){
					break;
				}
			}
			this.model = match - r.nextInt(count);
		}
		else{
			this.model = model;
		}
	}

	public int getPips(int phase, int type) {
		if (levelAvail[model] > level){
			throw new RuntimeException("Model not Available at this technology level");
		}
		return pips[phase*2+type][model];
	}

	public double getCombatAbility() {
		return combatAbility;
	}
}