package Strategy_Pattern_1;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("<< Silence >>");
	}

}
