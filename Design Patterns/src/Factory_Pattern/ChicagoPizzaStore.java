package Factory_Pattern;

public class ChicagoPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
		if (item.equals("Veggie"))
			return new ChicagoStylePizza();
		else
			return null;
	}
}
