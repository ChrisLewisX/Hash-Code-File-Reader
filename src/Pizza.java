public class Pizza
{
	private int rows;
	private int columns;
	private int min;
	private int max;
	private char[][] pizzaGrid;

	/**
	 * Create a new Pizza object
	 * @param min
	 * @param max
	 * @param pizza
	 */
	public Pizza(int min, int max, char[][] pizza)
	{
		this.rows = pizza.length;
		this.columns = pizza[0].length;
		this.min = min;
		this.max = max;

		pizzaGrid = pizza;
	}

	/**
	 * get the number of rows the pizza has
	 * @return int
	 */
	public int getRows()
	{
		return rows;
	}

	/**
	 * get the number of columns the pizza has
	 * @return int
	 */
	public int getColumns()
	{
		return columns;
	}

	/**
	 * get the minimum number of topping count per slice
	 * @return int
	 */
	public int getMin()
	{
		return min;
	}

	/**
	 * get the maximum number of topping count per slice
	 * @return
	 */
	public int getMax()
	{
		return max;
	}

	/**
	 * get the char grid representing the pizza
	 * @return char[][]
	 */
	public char[][] getPizzaGrid()
	{
		return pizzaGrid;
	}

	/**
	 * Print information about the pizza in a formatted manner
	 */
	public void printDetails()
	{
		System.out.println(rows + "*" + columns + "\t\tMin: " + min + "\t\tMax: " + max);
		for (int i = 0; i < pizzaGrid.length; i++)
		{
			for (int j = 0; j < pizzaGrid[i].length; j++)
			{
				System.out.print(pizzaGrid[i][j]);
			}
			System.out.print("\n");
		}
	}
}
