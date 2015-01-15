package comSim;

public class SouthAmericanCavalry extends Model {
	public SouthAmericanCavalry(int level, int model, double combatAbility){
		super(level, model, combatAbility,
				new String[]	{"South American Horsemen",	"South American Cavalry",	"South American Hussar",	"South American Swarm Cavalry",	"South American Dragoon"},
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
