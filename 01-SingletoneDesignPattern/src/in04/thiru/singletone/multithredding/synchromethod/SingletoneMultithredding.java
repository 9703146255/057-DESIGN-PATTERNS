package in04.thiru.singletone.multithredding.synchromethod;

public class SingletoneMultithredding {
	
	private static  SingletoneMultithredding instance=null;
	
	private SingletoneMultithredding() {
			
	}
	
	public synchronized static SingletoneMultithredding getInstance()
	{
		if(instance==null)
		{
			instance=new SingletoneMultithredding();
		}
		return instance;
	}

}
