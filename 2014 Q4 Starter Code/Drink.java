
public class Drink implements MenuItem {
	private String name;
	private double price;
	
	public Drink(double p, String n)
	{
		name = n;
		price = p;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
}
