package comSim;

public class Cavalry extends Regiment {
	public Cavalry(Technology technology, Model model) {
		super(technology, 1000, 2, model, false);
	}
	
	double getCombatModifier(int phase){
		return getTechnology().getCombatModifier(phase, 1);
	}
	String id() {
		return "c";
	}
	public String toString(){
		return String.format("{%04d}", getStrength());
	}
}
