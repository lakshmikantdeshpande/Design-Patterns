package Factory_Pattern;

public class ChicagoStylePizza extends Pizza {
	public ChicagoStylePizza() {
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";

		toppings.add("Shredded mozarella cheese");
	}

	void cut() {
		System.out.println("Cutting the pizza in four piceces");
	}
}
