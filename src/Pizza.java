public class Pizza
{
	private int rows;
	private int columns;
	private int min;
	private int max;
	private char[][] pizzaGrid;

	public Pizza(int min, int max, char[][] pizza)
	{
		this.rows = pizza.length;
		this.columns = pizza[0].length;
		this.min = min;
		this.max = max;

		pizzaGrid = pizza;
	}

	public int getRows()
	{
		return rows;
	}

	public int getColumns()
	{
		return columns;
	}

	public int getMin()
	{
		return min;
	}

	public int getMax()
	{
		return max;
	}

	public char[][] getPizzaGrid()
	{
		return pizzaGrid;
	}

	public void printPizzaDetails()
	{
		System.out.println(this + ":\t" + rows + "x" + columns + "\tMin: " + min + "\tMax: " + max);
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
