package Singleton_Pattern;

public class NormalSingleton {
	private boolean empty;
	private boolean boiled;
	private static NormalSingleton chocolateBoiler;

	private NormalSingleton() {
		empty = true;
		boiled = false;
	}

	// Draconian Synchronization
	public static synchronized NormalSingleton getInstance() {
		if (chocolateBoiler == null)
			chocolateBoiler = new NormalSingleton();
		return chocolateBoiler;
	}

	// fill the boiled with chocolate + milk
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled())
			empty = true;
	}

	public void boil() {
		if (!isEmpty() && !isBoiled())
			boiled = true;
	}

	public boolean isEmpty() {
		return empty;
	}

	private boolean isBoiled() {
		return boiled;
	}
}
