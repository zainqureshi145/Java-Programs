public class Employee extends Person {
	public double Salary;

	public Employee() {
	}

	public Employee(String a) {
		this.Name = a;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String toString() {
		return super.Name + " is an Instructor whose Salary is " + this.Salary;
	}
}
