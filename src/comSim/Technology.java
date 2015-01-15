package comSim;

public class Technology {
	private int level;
	private double discipline;
	private double moraleModifier;
	private double[] infantryFire	= {0.25,	0.25,	0.25,	0.25,	0.25,	0.25,	0.25,	0.35,	0.60,	0.60,	0.60,	0.60,	0.60,	0.60,	1.10,	1.10,	1.10,	1.10,	1.10,	1.10,	1.60,	1.60,	1.60,	1.60,	1.60,	1.60,	1.60,	2.10,	2.10,	2.10,	2.10,	3.10,	3.10};
	private double[] cavalryFire	= {0.00,	0.00,	0.00,	0.00,	0.00,	0.00,	0.00,	0.00,	0.00,	0.00,	0.00,	0.50,	0.50,	0.50,	0.50,	0.50,	0.50,	0.50,	0.50,	0.50,	0.50,	0.50,	1.00,	1.00,	1.00,	1.00,	1.00,	1.00,	1.00,	1.00,	1.00,	1.00,	1.00};
	private double[] artilleryFire	= {0.00,	0.00,	0.00,	0.00,	0.00,	0.00,	0.00,	1.00,	1.00,	1.00,	1.00,	1.00,	1.00,	1.40,	1.40,	1.40,	2.40,	2.40,	2.40,	2.40,	2.40,	2.40,	4.40,	4.40,	4.40,	6.40,	6.40,	6.40,	6.40,	6.40,	6.40,	6.40,	8.40};
	private double[] infantryShock	= {0.20,	0.30,	0.50,	0.50,	0.50,	0.65,	0.95,	0.95,	0.95,	0.95,	0.95,	1.15,	1.15,	1.15,	1.15,	1.15,	1.15,	1.15,	1.15,	1.15,	1.15,	1.65,	1.65,	1.65,	1.65,	1.65,	1.65,	1.65,	2.15,	2.15,	2.15,	2.15,	2.15};
	private double[] cavalryShock	= {0.80,	0.80,	1.00,	1.00,	1.00,	1.00,	1.00,	1.00,	2.00,	2.00,	2.00,	2.00,	2.00,	2.00,	2.00,	2.00,	2.00,	3.00,	3.00,	3.00,	3.00,	3.00,	3.00,	4.00,	4.00,	4.00,	4.00,	4.00,	4.00,	4.00,	4.00,	5.00,	5.00};
	private double[] artilleryShock	= {0.05,	0.05,	0.05,	0.05,	0.05,	0.05,	0.05,	0.05,	0.05,	0.05,	0.05,	0.05,	0.05,	0.15,	0.15,	0.15,	0.25,	0.25,	0.25,	0.25,	0.25,	0.25,	0.35,	0.35,	0.35,	0.45,	0.45,	0.45,	0.45,	0.45,	0.45,	0.45,	0.55};
	private double[] morale			= {2.00,	2.00,	2.00,	2.50,	3.00,	3.00,	3.00,	3.00,	3.00,	3.00,	3.00,	3.00,	3.00,	3.00,	3.00,	4.00,	4.00,	4.00,	4.00,	4.00,	4.00,	4.00,	4.00,	4.00,	4.00,	4.00,	5.00,	5.00,	5.00,	5.00,	6.00,	6.00,	6.00};
	private double[] tactics		= {0.50,	0.50,	0.50,	0.50,	0.75,	0.75,	1.00,	1.25,	1.50,	1.50,	1.50,	1.50,	1.75,	1.75,	1.75,	2.00,	2.00,	2.00,	2.00,	2.50,	2.50,	2.50,	2.50,	3.00,	3.00,	3.00,	3.00,	3.00,	3.00,	3.00,	3.50,	3.50,	3.50}; //TODO Wiki difference
	private double[] maneuver		= {1.00,	1.00,	1.00,	1.00,	1.00,	1.00,	1.00,	1.00,	1.00,	1.00,	1.25,	1.25,	1.25,	1.25,	1.25,	1.25,	1.25,	1.50,	1.75,	1.75,	1.75,	1.75,	1.75,	2.25,	2.25,	2.25,	2.25,	2.25,	2.50,	2.50,	2.75,	2.75,	2.75};
	private int[]	 combatWidth 	= {15,		15,		20,		20,		20,		22,		24,		24,		25,		25,		25,		27,		27,		27,		29,		29,		30,		30,		32,		32,		34,		34,		36,		36,		38,		38,		40,		40,		40,		40,		40,		40,		40};
	
	public Technology(int level, double discipline, double moraleModifier){
		this.level = level;
		this.discipline = discipline;
		this.moraleModifier = moraleModifier;
	}
	public Technology(int level){
		this(level, 1.0, 1.0);
	}

	public double getCombatModifier (int phase, int type) throws RuntimeException {
		if (phase == 0){
			if (type == 0){
				return infantryFire[level];				
			}
			if (type == 1){
				return cavalryFire[level];				
			}
			if (type == 2){
				return artilleryFire[level];				
			}
		}
		if (phase == 1){
			if (type == 0){
				return infantryShock[level];				
			}
			if (type == 1){
				return cavalryShock[level];				
			}
			if (type == 2){
				return artilleryShock[level];				
			}
		}
		throw new RuntimeException("Unknown combat phase or unit type");
	}
	public double getMorale() {
		return morale[level] * moraleModifier;
	}
	public double getTactics() {
		return tactics[level] * discipline;
	}
	public double getManeuver() {
		return maneuver[level];
	}
	public int getCombatWidth() {
		return combatWidth[level];
	}
	public void setLevel(int level){
		this.level = level;
	}
	public int getLevel(){
		return level;
	}
	public double getDiscipline() {
		return discipline;
	}
	public void setDiscipline(double discipline) {
		this.discipline = discipline;
	}
}
