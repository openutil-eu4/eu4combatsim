package comSim;

public class OttomanCavalry extends Model {
	public OttomanCavalry(int level, int model, double combatAbility){
	super(level, model, combatAbility,
			new String[]	{"Musellem Cavalry",	"Timariot Cavalry",	"Spahi Cavalry",	"Reformed Spahi Cavalry",	"Toprakli Hit and Run Cavalry",	"Eastern Uhlan",	"Eastern Skirmisher",	"Toprakli Dragoons",	"Reformed Lancer"},
			new int[]
					{1,	6,	10,	18,	23,	26,	26,	28,	28},
			new int[][]	{
			{0,	0,	0,	1,	2,	2,	1,	2,	1},
			{0,	0,	0,	1,	0,	1,	2,	2,	1},
			{2,	2,	3,	3,	4,	3,	4,	3,	5},
			{1,	1,	2,	3,	3,	4,	3,	3,	3},
			{1,	2,	3,	3,	4,	4,	4,	4,	5},
			{1,	1,	2,	3,	3,	3,	3,	4,	3}}
	);
	}
}