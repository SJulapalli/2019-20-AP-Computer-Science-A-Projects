
public class MenuItemRunner {

	public static void main(String[] args) {
		/*Code that initializes various MenuItems.  These will be passed in as Trio parameters.*/
		Sandwich cBurger = new Sandwich(2.75, "Cheeseburger");
		Sandwich clubSand = new Sandwich(2.75, "Club Sandwich");
		Salad spinachSalad = new Salad(1.25, "Spinach Salad");
		Salad coleslaw = new Salad(1.25, "Coleslaw");
		Drink fanta = new Drink(1.25, "Orange Soda");
		Drink cappuccino = new Drink(3.5, "Cappuccino");
		/* Code that initializes Trio elements*/
		Trio one = new Trio(cBurger,spinachSalad,fanta);
		Trio two = new Trio(clubSand,coleslaw,cappuccino);
		Trio three = new Trio(cBurger,spinachSalad,cappuccino);
		Trio four = new Trio(clubSand,spinachSalad,fanta);
		System.out.print("trio one equals\"Cheeseburger/Spinach Salad/Orange Soda Trio\" at $4.00: ");
		System.out.print("" + (one.getName().equals("Cheeseburger/Spinach Salad/Orange Soda Trio") && one.getPrice() == 4.0) + "\n");
		System.out.print("trio two equals\"Club Sandwich/Coleslaw/Cappuccino Trio\" at $6.25: ");
		System.out.print("" + (two.getName().equals("Club Sandwich/Coleslaw/Cappuccino Trio") && two.getPrice() == 6.25) + "\n");
		System.out.print("trio three equals\"Cheeseburger/Spinach Salad/Cappuccino Trio\" at $6.25: ");
		System.out.print("" + (three.getName().equals("Cheeseburger/Spinach Salad/Cappuccino Trio") && three.getPrice() == 6.25) + "\n");
		System.out.print("trio four equals\"Club Sandwich/Spinach Salad/Orange Soda Trio\" at $4.00: ");
		System.out.print("" + (four.getName().equals("Club Sandwich/Spinach Salad/Orange Soda Trio") && four.getPrice() == 4.0) + "\n");
}
}