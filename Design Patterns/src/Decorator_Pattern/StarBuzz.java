package Decorator_Pattern;

public class StarBuzz {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.description + " $" + beverage.cost());

		Beverage beverage2 = new Blend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.description + " $" + beverage2.cost());

	}
}
