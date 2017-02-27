package Factory_Pattern;

public class NYStylePizza extends Pizza {
	public NYStylePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin crust dough";
		sauce = "Marinara Sauce";

		toppings.add("Pineapple");
		toppings.add("Fresh baby tomatoes");
	}
}
