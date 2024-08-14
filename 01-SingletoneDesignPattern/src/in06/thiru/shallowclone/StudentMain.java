package in06.thiru.shallowclone;

public class StudentMain {
	 public static void main(String[] args) throws CloneNotSupportedException {
	        Student original = new Student("Alice", 20);
	        Student cloned = (Student) original.clone();

	        System.out.println("Original: " + original.getName() + ", " + original.getAge());
	        System.out.println("Cloned: " + cloned.getName() + ", " + cloned.getAge());
	        System.out.println("original  ::"+original.hashCode());
	        System.out.println("Cloned    ::"+cloned.hashCode());


	        // Modify the cloned object
	        cloned.setName("Bob");
	        cloned.setAge(25);

	        System.out.println("After modification:");
	        System.out.println("Original: " + original.getName() + ", " + original.getAge());
	        System.out.println("Cloned: " + cloned.getName() + ", " + cloned.getAge());
	        System.out.println("original  ::"+original.hashCode());
	        System.out.println("Cloned    ::"+cloned.hashCode());
	    }

}
