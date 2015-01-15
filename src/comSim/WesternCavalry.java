package comSim;

public class WesternCavalry extends Model {
	public WesternCavalry(int level, int model, double combatAbility){
	super(level, model, combatAbility,
			new String[]	{"Chevauchée",	"Western Medieval Knights",	"Schwarze Reiter",	"Latin Caracole Cavalry",	"Gallop Cavalry",	"Armee Blanche Cavalry",	"Latin Dragoons",	"Latin Hussars",	"Uhlan Cavalry",	"Reformed Latin Hussars",	"Carabiners",	"Latin Chasseur",	"Latin Lancers",	"Latin Cuirassiers"},
			new int[]
					{1,	1,	10,	14,	18,	23,	23,	23,	26,	26,	26,	28,	28,	28},
			new int[][] {
					{0,	0,	1,	1,	1,	1,	1,	1,	1,	1,	2,	2,	0,	1},
					{0,	0,	0,	0,	1,	1,	1,	2,	2,	2,	1,	1,	2,	2},
					{1,	1,	2,	3,	4,	5,	4,	4,	5,	4,	5,	4,	6,	5},
					{1,	0,	1,	2,	3,	3,	4,	3,	4,	4,	4,	4,	4,	4},
					{1,	1,	2,	2,	3,	5,	4,	4,	4,	4,	3,	5,	5,	4},
					{0,	1,	2,	2,	3,	3,	4,	4,	3,	4,	4,	5,	4,	5}}
	);
	}
}
/*			         0,	1,	2,	3,	4,	5,	6,	7,	8,	9,	10,	11,	12,	13 */