package Strategy_Pattern_1;

public abstract class Duck {

	FlyBehaviour flybehaviour;
	QuackBehaviour quackbehaviour;

	public Duck() {
	}

	public void performFly() {
		flybehaviour.fly();
	}

	public void performQuack() {
		quackbehaviour.quack();
	}

	public void swim() {
		System.out.println("All ducks swim, even decoys");
	}

	public void setFlybehaviour(FlyBehaviour flybehaviour) {
		this.flybehaviour = flybehaviour;
	}

	public void setQuackbehaviour(QuackBehaviour quackbehaviour) {
		this.quackbehaviour = quackbehaviour;
	}

}
