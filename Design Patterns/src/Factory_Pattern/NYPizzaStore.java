package Factory_Pattern;

public class NYPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
		if (item.equals("Cheese"))
			return new NYStylePizza();
		else
			return null;
	}
}
