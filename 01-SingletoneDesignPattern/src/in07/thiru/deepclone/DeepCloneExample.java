package in07.thiru.deepclone;

import java.util.ArrayList;
import java.util.List;

public class DeepCloneExample {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		List<String> subjects = new ArrayList<>();
		subjects.add("Math");
		subjects.add("Science");

		Course original = new Course("Engineering", subjects);
		Course cloned = (Course) original.clone();

		System.out.println("Original hashCode: " + original.hashCode());
		System.out.println("Cloned hashCode: " + cloned.hashCode());

		System.out.println("Original: " + original);
		System.out.println("Cloned: " + cloned);

		// Modify the cloned object
		cloned.getSubjects().add("History");

		System.out.println("After modification:");
		System.out.println("Original: " + original);
		System.out.println("Cloned: " + cloned);
	}

}
