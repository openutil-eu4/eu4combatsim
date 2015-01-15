package comSim;

public class NoModel extends Model {

	public NoModel(int level, int model, double combatAbility) {
		super(0, 0, 1.0, new String[0], new int[0], new int[0][0]);
		// TODO Auto-generated constructor stub
	}
	public int getPips(int phase, int type) {
		return 0;
	}
}
