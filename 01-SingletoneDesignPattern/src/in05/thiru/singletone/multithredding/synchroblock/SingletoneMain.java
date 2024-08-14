package in05.thiru.singletone.multithredding.synchroblock;

public class SingletoneMain {

	public static void main(String[] args) {

		SingletoneMultithredding instance1 = SingletoneMultithredding.getInstance();
		SingletoneMultithredding instance2 = SingletoneMultithredding.getInstance();
		SingletoneMultithredding instance3 = SingletoneMultithredding.getInstance();
		SingletoneMultithredding instance4 = SingletoneMultithredding.getInstance();
		SingletoneMultithredding instance5 = SingletoneMultithredding.getInstance();

		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(instance3.hashCode());
		System.out.println(instance4.hashCode());
		System.out.println(instance5.hashCode());

	}

}
