

public class Employee extends Person{
	private double Salary;
	
	public Employee(String name0){
		super(name0);
	}
	
	public Employee(String name0,Double salary0){
		super(name0);
		Salary = salary0;
	}
	
	public String toString(){
		return getName()+ "is an employee earning a salary of "+getSalary();
		
	}

	private double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
}
