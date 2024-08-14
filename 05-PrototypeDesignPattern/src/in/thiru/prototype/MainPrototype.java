package in.thiru.prototype;

public class MainPrototype {

	public static void main(String[] args) {
		Employee original = new Employee("John", "Doe", 30, "Engineering", "Developer");
		Employee cloned = original.clone();

		System.out.println(original.hashCode()+" ::Original Employee:: " + original);
		System.out.println(cloned.hashCode()+" ::Cloned Employee:: " + cloned);
	}

}
