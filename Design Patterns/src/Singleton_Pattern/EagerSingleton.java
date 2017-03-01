package Singleton_Pattern;

// Eagerly initialize the object
public class EagerSingleton {
	private static EagerSingleton uniqueInstance = new EagerSingleton();

	private EagerSingleton() {
	}

	public static synchronized EagerSingleton getInstance() {
		return uniqueInstance;
	}
}
