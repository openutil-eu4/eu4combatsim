package comSim;

public class SubsaharanInfantry extends Model {
	public SubsaharanInfantry(int level, int model, double combatAbility){
		super(level, model, combatAbility,
				new String[]	{"African Clubmen",	"African Spearmen",	"West African Warrior",	"Central African Warrior",	"South African Warrior",	"North African Warrior",	"African Plains Warriors",	"African Forest Warriors",	"African Hill Warriors",	"African Mountain Warriors",	"South African Musketeers",	"Central African Musketeers",	"East African Musketeers",	"North African Musketeers",	"Central African Guerrillas",	"East African Guerrillas",	"North African Guerrillas",	"Westernized South African Infantry",	"Westernized Central African Infantry",	"Westernized East African Infantry",	"Westernized North African Infantry",	"African Western Franchise Infantry"},
				new int[]
						{1,	1,	5,	5,	5,	5,	12,	12,	12,	12,	15,	15,	15,	15,	23,	23,	23,	26,	26,	26,	26,	30},
				new int[][] {
				{0,	0,	0,	0,	0,	0,	2,	1,	2,	1,	3,	3,	2,	2,	3,	3,	2,	4,	3,	4,	3,	3},
				{0,	0,	0,	0,	0,	0,	1,	1,	1,	2,	2,	2,	2,	3,	2,	3,	3,	3,	3,	4,	4,	3},
				{1,	0,	1,	1,	2,	2,	2,	2,	1,	2,	3,	2,	2,	2,	2,	2,	2,	3,	3,	2,	2,	3},
				{0,	1,	2,	1,	1,	2,	2,	2,	2,	2,	2,	2,	2,	3,	3,	2,	3,	3,	3,	2,	4,	3},
				{1,	1,	1,	2,	2,	1,	2,	2,	2,	1,	2,	2,	2,	1,	3,	2,	2,	3,	4,	3,	3,	4},
				{1,	1,	2,	2,	1,	1,	1,	2,	2,	2,	1,	2,	3,	2,	2,	3,	3,	3,	3,	4,	3,	4}}
		);
	}
}
