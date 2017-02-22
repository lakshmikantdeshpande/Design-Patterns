package Strategy_Pattern_1;

public class FlyRocketPowered implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}

}
