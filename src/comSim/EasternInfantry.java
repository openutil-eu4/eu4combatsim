package comSim;

public class EasternInfantry extends Model {
	public EasternInfantry(int level, int model, double combatAbility){
		super(level, model, combatAbility,
				new String[]	{"Bardiche Infantry",	"Eastern Medieval Infantry",	"Eastern Militia",	"Pike Infantry",	"Defensive Eastern Musketeers",	"Offensive Eastern Musketeers",	"Soldaty Infantry",	"Eastern Tercio",	"Saxon Infantry",	"Petrine Infantry",	"Green Coat Infantry",	"Mass Infantry"},
				new int[]
						{1,	1,	5,	9,	12,	12,	15,	15,	19,	23,	26,	30},
				new int[][] {
				{0,	0,	0,	0,	2,	2,	3,	2,	3,	2,	3,	4},
				{0,	0,	0,	0,	2,	1,	1,	2,	2,	3,	3,	3},
				{0,	1,	1,	1,	1,	2,	2,	1,	3,	2,	3,	4},
				{0,	0,	1,	2,	2,	1,	1,	2,	2,	3,	3,	3},
				{1,	1,	1,	1,	2,	3,	3,	2,	2,	3,	4,	4},
				{1,	0,	1,	2,	2,	2,	2,	3,	2,	3,	4,	3},}
		);
	}
}
