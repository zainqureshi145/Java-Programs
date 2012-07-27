public class Employee extends Person {
	public double Salary;
	public String EName;

	/*public Employee(double Salary, String Ename) {
		this.EName = Ename;
		this.Salary = Salary;
	}*/
	public Employee()
	{
		
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
		return this.EName + " is an Instructor whose Salary is " + this.Salary;
	}
}
