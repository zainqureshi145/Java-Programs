public class Employee extends Person {
	private double Salary;

	public Employee() {
	}

	public Employee(String a) {
		super.setName(a);
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String toString() {
		return getName() + " is an instructor with salary " + this.Salary;
	}
}
