package comSim;

public class MuslimInfantry extends Model {
	public MuslimInfantry(int level, int model, double combatAbility){
		super(level, model, combatAbility,
				new String[]	{"Muslim Footsoldier",	"Muslim Archer",	"Muslim Duel Infantry",	"Shamshir Infantry",	"Muslim Musketeer",	"Afsharid Reformed Infantry",	"Reformed Muslim Musketeers",	"Muslim Mass Infantry",	"Muslim Rifle Infantry"},
				new int[]
						{1,	1,	5,	9,	12,	15,	23,	26,	30},
				new int[][] {
				{0,	0,	0,	0,	2,	3,	1,	3,	3},
				{0,	0,	0,	0,	2,	2,	2,	4,	3},
				{1,	1,	1,	2,	1,	2,	3,	3,	3},
				{0,	1,	1,	1,	2,	2,	3,	3,	3},
				{1,	0,	1,	2,	2,	2,	5,	3,	4},
				{1,	1,	1,	2,	3,	2,	4,	3,	4}}
		);
	}
}
