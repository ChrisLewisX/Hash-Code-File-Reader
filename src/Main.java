public class Main
{
	public static void main(String[] args)
	{
		new Main();
	}

	private Main()
	{
		Reader r = new Reader("data/example.in");
		Pizza pizza = r.readFile();

		pizza.printPizzaDetails();
	}
}
