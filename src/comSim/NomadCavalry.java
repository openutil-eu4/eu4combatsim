package comSim;

public class NomadCavalry extends Model {
	public NomadCavalry(int level, int model, double combatAbility){
	super(level, model, combatAbility,
			new String[]	{"Eastern Swarm Cavalry",	"Eastern Steppe Cavalry"},
			new int[]
					{1,	1},
			new int[][]	{
			{0,	0},
			{0,	0},
			{2,	1},
			{1,	1},
			{2,	2},
			{1,	2}}
	);
	}
}