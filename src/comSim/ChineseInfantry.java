package comSim;

public class ChineseInfantry extends Model {
	public ChineseInfantry(int level, int model, double combatAbility){
		super(level, model, combatAbility,
				new String[]	{"Asian Longspear",	"Asian Longbow",	"East Asian Spearmen",	"Defensive Asian Footsoldier",	"Offensive Asian Footsoldier",	"Asian Arquebusier",	"Banner Infantry",	"Asian Mass Infantry",	"Asian Musketeer",	"Reformed Asian Musketeer"},
				new int[]
						{1,	1,	1,	5,	5,	9,	12,	15,	19,	26},
				new int[][] {
				{0,	0,	0,	0,	0,	1,	1,	3,	3,	4},
				{0,	0,	0,	0,	0,	1,	2,	2,	3,	4},
				{0,	1,	0,	1,	1,	1,	2,	2,	2,	3},
				{1,	0,	1,	1,	0,	1,	1,	2,	2,	3},
				{0,	0,	1,	1,	2,	1,	2,	2,	3,	3},
				{1,	1,	0,	1,	1,	1,	2,	2,	2,	3}}
		);
	}
}
