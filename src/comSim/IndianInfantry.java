package comSim;

public class IndianInfantry extends Model {
	public IndianInfantry(int level, int model, double combatAbility){
		super(level, model, combatAbility,
				new String[]	{"Indian Footsoldier",	"Indian Arquebusier",	"Toofangchis",	"Poligar Infantry",	"Akbarid Musketeers",	"South Indian Infantry",	"North Indian Musket Infantry",	"Deccani Musket Infantry",	"Telingas",	"North Indian Sepoy",	"Indian Drill Infantry"},
				new int[]
						{1,	5,	9,	9,	12,	12,	18,	18,	23,	26,	30},
				new int[][] {
				{0,	1,	1,	1,	2,	2,	3,	3,	4,	3,	4},
				{0,	0,	1,	2,	2,	1,	2,	3,	3,	3,	3},
				{1,	1,	1,	1,	1,	2,	2,	2,	2,	3,	3},
				{0,	1,	1,	1,	2,	1,	2,	2,	2,	3,	3},
				{1,	1,	2,	1,	2,	3,	3,	2,	2,	3,	4},
				{1,	0,	1,	1,	2,	2,	2,	2,	3,	4,	3}}
		);
	}
}
