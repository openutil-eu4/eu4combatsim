package comSim;

public class NorthAmericanCavalry extends Model {
	public NorthAmericanCavalry(int level, int model, double combatAbility){
		super(level, model, combatAbility,
				new String[]	{"North American Horsemen",	"North American Cavalry",	"North American Hussar",	"North American Swarm Cavalry",	"North American Dragoon"},
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
