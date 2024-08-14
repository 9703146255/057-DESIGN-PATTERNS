package in.thiru.prototype;

public class Employee implements Prototype {
	String firstName;
	private String lastName;
	private int age;
	private String department;
	String position;

	public Employee(String firstName, String lastName, int age, String department, String position) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.department = department;
		this.position = position;
	}

	@Override
	public Employee clone() {
		// TODO Auto-generated method stub
		return new Employee(firstName, lastName, age, department, position);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getDepartment() {
		return department;
	}

	public String getPosition() {
		return position;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", department="
				+ department + ", position=" + position + "]";
	}

}
