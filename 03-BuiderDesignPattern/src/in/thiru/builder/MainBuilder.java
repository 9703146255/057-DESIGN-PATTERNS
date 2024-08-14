package in.thiru.builder;

public class MainBuilder {
public static void main(String[] args) {
	Employee employee = new Employee.Builder("John", "Doe")
			.age(30)
			.department("Engineering")
			.position("Developer")
			.build();

		System.out.println("Employee Details:");
		System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
		System.out.println("Age: " + employee.getAge());
		System.out.println("Department: " + employee.getDepartment());
		System.out.println("Position: " + employee.getPosition());
			
	
}

}
