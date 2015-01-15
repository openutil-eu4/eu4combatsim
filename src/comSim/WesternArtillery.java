package comSim;

public class WesternArtillery extends Model {
	public WesternArtillery(int level, int model, double combatAbility){
		super(level, model, combatAbility,
				new String[] {"Large Cast Bronze Mortar",	"Houfnice",	"Culverin",	"Pedrero",	"Small Cast Iron Cannon",	"Large Cast Iron Cannon",	"Chambered Demi Cannon",	"Leather Cannon",	"Swivel Cannon",	"Coehorn Mortar",	"Royal Mortar",	"Flying Battery"},
				new int[] {7,	7,	10,	10,	13,	13,	16,	18,	20,	22,	25,	29},
				new int[][]  {
				{1,	1,	1,	1,	1,	2,	2,	2,	3,	3,	4,	4},
				{0,	0,	1,	1,	1,	1,	2,	2,	2,	3,	4,	4},
				{0,	0,	0,	0,	0,	0,	0,	1,	1,	1,	1,	2},
				{0,	0,	1,	0,	1,	0,	1,	1,	1,	1,	1,	2},
				{0,	1,	1,	1,	2,	1,	2,	2,	3,	3,	3,	4},
				{1,	0,	0,	1,	1,	2,	1,	2,	2,	3,	3,	4}}
		);
	}

}
