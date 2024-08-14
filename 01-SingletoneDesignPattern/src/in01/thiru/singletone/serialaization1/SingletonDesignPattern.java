package in01.thiru.singletone.serialaization1;

import java.io.Serializable;

public class SingletonDesignPattern implements Serializable {

	String name = "thirumalesh";

	private static SingletonDesignPattern instance = null;

	private SingletonDesignPattern() {
		System.out.println("I am singletone constructor");
	}

	public static SingletonDesignPattern getInstance() {
		if (instance == null) {
			instance = new SingletonDesignPattern();
		}

		return instance;
	}

	

}
