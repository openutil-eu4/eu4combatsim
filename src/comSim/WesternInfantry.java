package comSim;

public class WesternInfantry extends Model {
	public WesternInfantry(int level, int model, double combatAbility){
		super(level, model, combatAbility,
				new String[]	{"Halberd Infantry", "Latin Medieval Infantry", "Men at Arms", "Longbow", "Galloglaigh Infantry", "Condotta Infantry", "Landsknechten Infantry", "Reformed Galloglaigh Infantry", "Tercio Infantry", "Free Shooter Infantry", "Maurician Infantry", "Charge Infantry", "Reformed Tercio", "Gustavian Infantry", "Highlanders Infantry", "Grenzer Infantry", "Caroline Infantry", "Line Infantry", "White Coat Infantry", "Blue Coat Infantry", "Red Coat Infantry", "Frederickian Infantry", "Impulse Infantry", "Square Infantry", "Mixed Order Infantry", "Drill Infantry", "Jaeger Infantry", "Napoleonic Square"},
				new int[]
						{1, 1, 5, 5, 5, 9, 9, 9, 12, 12, 15, 15, 19, 19, 19, 23, 23, 23, 26, 26, 26, 26, 28, 28, 30, 30, 30, 30},
				new int[][] {
						{0, 0, 0, 0, 0, 0, 0, 0,  1,  1,  2,  1,  2,  3,  2,  2,  3,  3,  4,  3,  3,  4,  4,  3,  4,  4,  4,  4},
						{0, 0, 0, 0, 0, 0, 0, 0,  2,  2,  2,  2,  2,  2,  2,  3,  2,  3,  3,  3,  4,  3,  3,  4,  3,  4,  4,  4},
						{1, 0, 0, 1, 1, 2, 1, 2,  1,  2,  2,  3,  2,  3,  3,  2,  3,  2,  3,  3,  3,  3,  3,  3,  4,  3,  4,  4},
						{0, 0, 1, 0, 0, 1, 1, 0,  2,  1,  1,  1,  3,  2,  2,  3,  2,  2,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3},
						{1, 1, 1, 1, 2, 1, 1, 2,  2,  3,  3,  3,  3,  3,  4,  3,  3,  3,  3,  4,  4,  4,  4,  4,  4,  4,  3,  4},
						{0, 1, 1, 1, 0, 1, 2, 1,  2,  1,  2,  2,  3,  2,  2,  3,  3,  3,  4,  4,  3,  3,  4,  4,  4,  4,  4,  3}}
		);
	}
}
