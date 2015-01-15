package comSim;

public class Infantry extends Regiment {
	public Infantry(Technology technology, Model model) {
		super(technology, 1000, 1, model, false);
	}
	
	double getCombatModifier(int phase){
		return getTechnology().getCombatModifier(phase, 0);
	}

	String id() {
		return "i";
	}
	public String toString(){
		return String.format("(%04d)", getStrength());
	}
}
