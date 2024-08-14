package in03.thiru.singletone.multithredding;

public class SingletoneMultithredding {
	
	private static  SingletoneMultithredding instance=null;
	
	private SingletoneMultithredding() {
			
	}
	
	public static SingletoneMultithredding getInstance()
	{
		if(instance==null)
		{
			instance=new SingletoneMultithredding();
		}
		return instance;
	}

}
