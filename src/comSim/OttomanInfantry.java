package comSim;

public class OttomanInfantry extends Model {
	public OttomanInfantry(int level, int model, double combatAbility){
		super(level, model, combatAbility,
				new String[]	{"Yaya Infantry",	"Azab Infantry",	"Janissary Infantry",	"Sekban Infantry",	"Reformed Janissary Infantry",	"Nizami Cedid Infantry",	"Eastern Carabinier",	"Eastern New Model Infantry"},
				new int[]
						{1,	5,	9,	12,	19,	23,	26,	30},
				new int[][] {
				{0,	0,	1,	2,	2,	2,	4,	3},
				{0,	0,	0,	2,	2,	3,	3,	3},
				{1,	1,	1,	2,	2,	2,	3,	3},
				{0,	1,	1,	1,	2,	2,	3,	3},
				{1,	2,	2,	2,	3,	3,	3,	4},
				{1,	1,	2,	3,	2,	3,	3,	4}}
		);
	}
}
