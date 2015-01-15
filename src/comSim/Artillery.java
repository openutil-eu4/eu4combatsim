package comSim;

public class Artillery extends Regiment {
	public Artillery(Technology technology, Model model) {
		super(technology, 1000, 2, model, true);
	}
	
	double getCombatModifier(int phase){
		if (isBackRow()){
			return getTechnology().getCombatModifier(phase, 2) / 2.0;
		} else {
			return getTechnology().getCombatModifier(phase, 2);
		}
	}

	String id() {
		return "a";
	}
	public String toString(){
		return String.format("[%04d]", getStrength());
	}
	public void storeCasualties(int casualties){
		if (!isBackRow()){
			super.storeCasualties(casualties*2);
		} else {
			super.storeCasualties(casualties);
		}
	}
	public void storeMorale(double morale){
		if (!isBackRow()){
			super.storeMorale(morale*2);
		} else {
			super.storeMorale(morale);
		}

	}
	
}
