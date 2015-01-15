package comSim;

public class NorthAmericanInfantry extends Model {
	public NorthAmericanInfantry(int level, int model, double combatAbility){
		super(level, model, combatAbility,
				new String[]	{"Clubmen",	"Native American Archer",	"Ambush Infantry",	"American Plains Warriors",	"Algonkin Tomahawk Warriors",	"Native American Mountain Warriors",	"Native American Arquebusier",	"Creek Arquebusier",	"Rifle Scout Infantry",	"North American Guerrillas",	"American Westernized Infantry"},
				new int[]
						{1,	1,	5,	5,	5,	10,	14,	14,	19,	26,	30},
				new int[][] {
				{0,	0,	0,	0,	0,	1,	2,	2,	3,	4,	4},
				{0,	0,	0,	0,	0,	1,	2,	2,	3,	3,	3},
				{1,	0,	1,	2,	2,	1,	2,	2,	2,	2,	3},
				{0,	1,	2,	1,	1,	2,	1,	2,	2,	4,	3},
				{1,	1,	2,	1,	2,	2,	3,	2,	2,	3,	4},
				{1,	1,	1,	2,	1,	1,	2,	2,	2,	3,	3}}
		);
	}
}
