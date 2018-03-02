public class Main
{
	/**
	 * Provide the program with a static entrance point which creates a new Main object
	 * @param args
	 */
	public static void main(String[] args)
	{
		new Main();
	}

	/**
	 * Create a new Main object
	 * Constructor private as nothing else should create a Main object
	 */
	private Main()
	{
		Reader r = new Reader("data/example.in");
		Pizza pizza = r.readFile();

		pizza.printDetails();
	}
}
