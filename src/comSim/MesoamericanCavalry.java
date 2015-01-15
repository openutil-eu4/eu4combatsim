package comSim;

public class MesoamericanCavalry extends Model {
	public MesoamericanCavalry(int level, int model, double combatAbility){
		super(level, model, combatAbility,
				new String[]	{"Central American Horsemen",	"Central American Cavalry",	"Central American Hussar",	"Central American Swarm Cavalry",	"Central American Dragoon"},
				new int[]
						{6,	10,	14,	19,	23},
				new int[][] {
				{0,	0,	1,	1,	2},
				{0,	1,	1,	2,	2},
				{2,	3,	3,	3,	3},
				{1,	2,	2,	3,	3},
				{1,	2,	3,	3,	4},
				{1,	2,	2,	2,	4}}
		);
	}
}
