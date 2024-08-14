package in05.thiru.singletone.multithredding.synchroblock;

public class SingletoneMultithredding {

	private static SingletoneMultithredding instance = null;

	private SingletoneMultithredding() {

	}

	public synchronized static SingletoneMultithredding getInstance() {

		System.out.println("HELLO");
		System.out.println("HELLO");
		System.out.println("HELLO");
		System.out.println("HELLO");
		System.out.println("HELLO");
		System.out.println("HELLO");
		//this is called doubled checked locking
		//example of the singleton class is Runtime classes
		//Runtime ,Calendar classes are the singleton classes
		//Runtime runtime = Runtime.getRuntime();, Desktop desktop = Desktop.getDesktop();,Calendar calendar = Calendar.getInstance();
		if (instance == null) {

			synchronized (SingletoneMultithredding.class) {
				if (instance == null)
					instance = new SingletoneMultithredding();

			}
		}

		return instance;
	}

	Object readResolve() {
		return instance;
	}

}
