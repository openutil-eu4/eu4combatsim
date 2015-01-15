package comSim;

public class IndianCavalry extends Model {
	public IndianCavalry(int level, int model, double combatAbility){
	super(level, model, combatAbility,
			new String[]	{"Elephant Archers",	"Indian Cavalry",	"Indian Cavalry Archers",	"Mansabdar Cavalry",	"Dai-Phat Cavalry",	"Maratha Raiders",	"Deccani Light Cavalry",	"Mysorean Light Cavalry",	"Sowars"},
			new int[]
					{1,	1,	6,	10,	14,	17,	23,	28,	28},
			new int[][]	{
			{0,	0,	0,	1,	2,	0,	1,	2,	1},
			{0,	0,	0,	0,	0,	2,	1,	1,	2},
			{1,	0,	2,	3,	2,	4,	4,	4,	4},
			{0,	1,	2,	2,	3,	3,	3,	4,	4},
			{1,	1,	1,	2,	3,	3,	4,	3,	4},
			{1,	1,	1,	2,	2,	2,	3,	4,	3}}
	);
	}
}