package comSim;

public class MuslimCavalry extends Model {
	public MuslimCavalry(int level, int model, double combatAbility){
	super(level, model, combatAbility,
			new String[]	{"Muslim Cavalry Archers",	"Muslim Cavalry",	"Charge Cavalry",	"Shayhanid Cavalry",	"Qizilbash Cavalry",	"Muslim Musketeer Cavalry",	"Musket Charge Cavalry",	"Afsharid Reformed Cavalry",	"Ali Bey Reformed Cavalry",	"Muslim Dragoon",	"Durrani Cavalry",	"Durrani Swivel Cavalry"},
			new int[]
					{1,	1,	1,	6,	10,	14,	18,	18,	23,	23,	28,	28},
			new int[][]	{
			{0,	0,	0,	0,	0,	1,	1,	0,	2,	1,	2,	1},
			{0,	0,	0,	0,	0,	0,	1,	1,	1,	2,	1,	2},
			{1,	1,	2,	2,	2,	2,	4,	4,	4,	3,	4,	4},
			{1,	0,	0,	1,	1,	2,	3,	3,	3,	3,	3,	4},
			{1,	2,	1,	1,	2,	2,	3,	3,	3,	3,	4,	4},
			{1,	1,	1,	2,	2,	2,	2,	3,	3,	4,	4,	3}}
	);
	}
}