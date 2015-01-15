package comSim;

public class SubsaharanCavalry extends Model {
	public SubsaharanCavalry(int level, int model, double combatAbility){
		super(level, model, combatAbility,
				new String[]	{"Abyssinian Light Cavalry",	"Mandekalu Cavalry",	"Somali Light Cavalry",	"Tuareg Cavalry",	"Mossi Horsemen",	"Abyssinian Barded Cavalry",	"African Hussar",	"African Swarm Cavalry",	"African Dragoon",	"African Cuirassier"},
				new int[]
						{1,	1,	6,	6,	10,	10,	14,	17,	23,	28},
				new int[][] {
				{0,	0,	0,	0,	0,	0,	1,	0,	1,	1},
				{0,	0,	0,	0,	0,	0,	0,	1,	1,	1},
				{1,	1,	2,	2,	2,	3,	3,	4,	3,	4},
				{1,	1,	1,	1,	2,	2,	2,	3,	3,	4},
				{2,	1,	1,	2,	3,	3,	3,	3,	4,	4},
				{0,	1,	2,	1,	3,	2,	3,	2,	4,	4}}
		);
	}
}
