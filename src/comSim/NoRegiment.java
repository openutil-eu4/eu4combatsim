package comSim;

public class NoRegiment extends Regiment {
	public NoRegiment(Technology technology) {
		super(technology, 0, 0, new NoModel(-1, -1, 1.0), false);
	}
	public NoRegiment() {
		this(new Technology(1));
	}
	
	double getCombatModifier(int phase){
		return 0.0;
	}
	String id() {
		return "n";
	}
	public String toString(){
		return String.format("  --  ");
	}
	public int dealCasualties(int roll, int phase){
		return 0;
	}
	public double getCurrentMorale() {
		return 0.0;
	}

}