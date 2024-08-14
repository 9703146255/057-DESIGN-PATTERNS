package in00.thiru.singletone;

public class SingletonMain {
	
	public static void main(String[] args) {
		
	SingletonDesignPattern instance1 = SingletonDesignPattern.getInstance();
	SingletonDesignPattern instance2 = SingletonDesignPattern.getInstance();
	SingletonDesignPattern instance3 = SingletonDesignPattern.getInstance();
	SingletonDesignPattern instance4 = SingletonDesignPattern.getInstance();
	SingletonDesignPattern instance5 = SingletonDesignPattern.getInstance();
	
	System.out.println(instance1.hashCode());
	System.out.println(instance2.hashCode());
	System.out.println(instance3.hashCode());
	System.out.println(instance4.hashCode());
	System.out.println(instance5.hashCode());
	
	}

}
