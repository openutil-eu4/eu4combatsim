package comSim;

public class MesoamericanInfantry extends Model {
	public MesoamericanInfantry(int level, int model, double combatAbility){
		super(level, model, combatAbility,
				new String[]	{"Mesoamerican Spearmen",	"American Forest Warriors",	"American Hill Warriors",	"American Plains Warriors",	"Reformed American Hill Warriors",	"Reformed American Forest Warriors",	"Reformed American Plains Warriors",	"American Hill Musketeers",	"American Forest Musketeers",	"Offensive American Musketeers",	"Central American Guerrillas",	"American Guerrilla Warfare",	"Westernized American Hill Infantry",	"Westernized American Plains Infantry",	"Westernized Central American Infantry"},
				new int[]
						{1,	5,	5,	5,	10,	10,	10,	14,	14,	14,	19,	19,	26,	26,	30},
				new int[][] {
				{0,	0,	0,	0,	0,	0,	0,	2,	2,	2,	2,	3,	3,	4,	4},
				{0,	0,	0,	0,	0,	0,	0,	1,	2,	1,	2,	2,	4,	3,	3},
				{1,	2,	2,	1,	3,	2,	1,	3,	2,	1,	2,	3,	2,	4,	3},
				{0,	1,	1,	1,	1,	2,	2,	2,	2,	2,	2,	2,	3,	3,	3},
				{1,	1,	2,	2,	2,	2,	3,	2,	2,	3,	3,	2,	3,	3,	3},
				{1,	2,	1,	2,	2,	2,	2,	2,	2,	3,	3,	2,	4,	2,	4}}
		);
	}
}
