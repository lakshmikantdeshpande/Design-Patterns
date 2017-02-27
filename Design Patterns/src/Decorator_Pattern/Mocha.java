package Decorator_Pattern;

public class Mocha extends CondimentDecorator {
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.description + " Mocha";
	}

	@Override
	public double cost() {
		return .20 + beverage.cost();
	}

}
