package comSim;

public class SouthAmericanInfantry extends Model {
	public SouthAmericanInfantry(int level, int model, double combatAbility){
		super(level, model, combatAbility,
				new String[]	{"South American Spearmen",	"American Mountain Warriors",	"Reformed Mountain Warriors",	"South American Forest Warriors",	"Incan Slingshots",	"Incan Axemen",	"Defensive American Musketeers",	"South American Arquebusier",	"Reformed American Musketeers",	"Incan Guerrilla",	"South American Guerrilla",	"Westernized South American Infantry",	"Westernized Incan Infantry",	"Reformed Westernized Incan Infantry"},
				new int[]
						{1,	1,	5,	5,	5,	5,	10,	10,	14,	19,	19,	26,	26,	30},
				new int[][] {
				{0,	0,	0,	0,	0,	0,	1,	1,	2,	2,	2,	3,	4,	4},
				{0,	0,	0,	0,	0,	0,	1,	2,	2,	3,	2,	4,	3,	4},
				{1,	0,	1,	1,	2,	1,	1,	1,	2,	2,	2,	2,	3,	3},
				{1,	1,	2,	2,	2,	1,	2,	1,	2,	2,	2,	3,	3,	3},
				{1,	1,	1,	2,	1,	2,	1,	2,	2,	2,	3,	3,	3,	3},
				{0,	1,	2,	1,	1,	2,	2,	1,	2,	3,	3,	4,	3,	3}}
		);
	}
}
