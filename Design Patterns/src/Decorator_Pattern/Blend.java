package Decorator_Pattern;

public class Blend extends Beverage {

	public Blend() {
		this.description = "House Blend";
	}

	@Override
	public double cost() {
		return .89;
	}

}
