package Factory_Pattern;

public class PizzaTest {
	public static void main(String[] args) {
		PizzaStore pn = new NYPizzaStore();
		PizzaStore pc = new ChicagoPizzaStore();

		Pizza pizza1 = pn.orderPizza("Cheese");
		System.out.println("Sachin ordered a NY style pizza "
				+ pizza1.getName() + "\n");

		Pizza pizza2 = pc.orderPizza("Veggie");
		System.out.println("Sachin ordered a Chicago style pizza "
				+ pizza2.getName() + "\n");
	}
}
