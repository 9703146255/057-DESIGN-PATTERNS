package in00.thiru.singletone;

public class SingletonDesignPattern {
	
	private static SingletonDesignPattern instance=null;
	
	private SingletonDesignPattern() {
		System.out.println("I am singletone constructor");
	}
	
	public static SingletonDesignPattern getInstance()
	{
		if(instance==null)
		{
			instance=new SingletonDesignPattern();
		}
		
		return instance;
	}

}
