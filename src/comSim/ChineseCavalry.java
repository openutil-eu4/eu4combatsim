package comSim;

public class ChineseCavalry extends Model {
	public ChineseCavalry(int level, int model, double combatAbility){
	super(level, model, combatAbility,
			new String[]	{"Archer Cavalry",	"East Asian Archer Cavalry",	"Asian Steppe Cavalry",	"Samurai Cavalry",	"Reformed Asian Steppe Cavalry",	"Asian Charge Cavalry",	"Banner Cavalry",	"Asian Dragoons",	"Reformed Asian Cavalry",	"Green Standard Cavalry"},
			new int[]
					{1,	1,	6,	6,	10,	14,	17,	23,	28,	28},
			new int[][]	{
			{0,	0,	0,	0,	1,	0,	1,	1,	1,	2},
			{0,	0,	0,	0,	0,	1,	1,	2,	2,	1},
			{0,	1,	2,	2,	2,	3,	3,	3,	5,	4},
			{1,	0,	2,	1,	2,	2,	3,	3,	4,	4},
			{1,	1,	1,	2,	2,	3,	3,	4,	3,	4},
			{1,	1,	1,	1,	2,	3,	3,	3,	4,	4}}
	);
	}
}