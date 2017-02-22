package Strategy_Pattern_1;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flybehaviour = new FlyNoWay();
		quackbehaviour = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}

}
