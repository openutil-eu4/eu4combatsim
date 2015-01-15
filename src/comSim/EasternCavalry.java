package comSim;

public class EasternCavalry extends Model {
	public EasternCavalry(int level, int model, double combatAbility){
	super(level, model, combatAbility,
			new String[]	{"Eastern Knights",	"Druzhina Cavalry",	"Stratioti Cavalry",	"Eastern Hussar",	"Reformed Eastern Hussars",	"Eastern Caracole",	"Southern Cossacks",	"Winged Hussars",	"Cossack Cavalry",	"Lancers",	"Reformed Cossack Cavalry",	"Eastern Cuirassiers",	"Advanced Cossack Cavalry"},
			new int[]
			{1,	1,	6,	10,	14,	14,	14,	22,	22,	26,	26,	28,	28},
			new int[][] {
			{0,	0,	0,	0,	1,	2,	0,	0,	1,	0,	1,	1,	2},
			{0,	0,	0,	0,	1,	0,	1,	1,	1,	1,	1,	2,	1},
			{1,	0,	2,	2,	3,	2,	4,	5,	4,	5,	4,	5,	4},
			{0,	1,	1,	2,	3,	2,	2,	4,	3,	4,	4,	4,	4},
			{1,	1,	1,	3,	2,	3,	2,	4,	4,	4,	4,	4,	5},
			{1,	1,	1,	2,	2,	3,	3,	3,	4,	4,	4,	4,	4}}
	);
	}
}