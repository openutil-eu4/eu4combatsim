package comSim;

public class NomadInfantry extends Model {
	public NomadInfantry(int level, int model, double combatAbility){
		super(level, model, combatAbility,
				new String[]	{"Eastern Archers"},
				new int[]
						{1},
				new int[][] {
				{0},
				{0},
				{1},
				{1},
				{1},
				{1}}
		);
	}
}