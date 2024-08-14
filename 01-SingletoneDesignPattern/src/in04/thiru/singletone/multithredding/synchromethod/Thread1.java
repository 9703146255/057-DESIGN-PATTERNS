package in04.thiru.singletone.multithredding.synchromethod;

public class Thread1 extends Thread {
	
	//thread is a independent part of execution within a same program

	@Override
	public void run() {

		SingletoneMultithredding s1 = SingletoneMultithredding.getInstance();
	
		System.out.println(s1.hashCode());
		
		System.out.println(Thread.currentThread().getName());

	}

	public static void main(String[] args) {

		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();

		t1.setName("thiru1");
		t2.setName("thiru2");
		t1.start();
		t2.start();
		System.out.println("======================================================");
		SingletoneMultithredding instance1 = SingletoneMultithredding.getInstance();
		SingletoneMultithredding instance2 = SingletoneMultithredding.getInstance();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println("======================================================");

	}

}
