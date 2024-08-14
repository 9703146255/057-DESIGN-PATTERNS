package in.thiru.builder;

public class Employee {
	private final String firstName;
	private final String lastName;
	private final int age;
	private final String department;
	private final String position;

	public Employee(Builder builder) {
		super();
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.department = builder.department;
		this.position = builder.position;
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

	public static class Builder {
		private final String firstName;
		private final String lastName;
		private int age;
		private String department;
		private String position;

		// Builder constructor with required parameters (mandatory fields)
		public Builder(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}

		// Optional parameters setters
		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder department(String department) {
			this.department = department;
			return this;
		}

		public Builder position(String position) {
			this.position = position;
			return this;
		}


		// Build method to create an Employee instance
		public Employee build() {
			return new Employee(this);
		}

	}

}
