package Singleton_Pattern;

// Double checked locking
public class CriticalSingleton {
	// eager approach
	private volatile static CriticalSingleton uniqueInstance;

	private CriticalSingleton() {
	}

	public static synchronized CriticalSingleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (CriticalSingleton.class) {
				if (uniqueInstance == null)
					uniqueInstance = new CriticalSingleton();
			}
		}
		return uniqueInstance;
	}
}
