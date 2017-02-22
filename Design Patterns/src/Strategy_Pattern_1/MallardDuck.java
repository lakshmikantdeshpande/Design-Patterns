package Strategy_Pattern_1;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackbehaviour = new Quack();
		flybehaviour = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a real Mallard Duck");
	}

}
