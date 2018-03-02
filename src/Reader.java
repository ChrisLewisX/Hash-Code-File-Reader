import java.io.File;
import java.util.Scanner;

public class Reader
{
	private File file;

	public Reader(String file)
	{
		this.file = new File(file);
	}

	public Pizza readFile()
	{
		Scanner s = null;
		int rows, columns, min, max;
		char[][] pizzaGrid;
		Pizza pizza = null;
		try
		{
			s = new Scanner(file);
		}
		catch (Exception ex)
		{
			ex.getMessage();
		}

		if(s != null)
		{
			rows = s.nextInt();
			columns = s.nextInt();
			min = s.nextInt();
			max = s.nextInt();

			pizzaGrid = new char[rows][columns];

			s.useDelimiter("\n");

			int count = 0;
			while(s.hasNext() && count < columns)
			{
				String line = s.next();
				pizzaGrid[count] = line.toCharArray();
				count++;
			}
			pizza = new Pizza(min, max, pizzaGrid);
		}

		return pizza;
	}
}
