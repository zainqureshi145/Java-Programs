
public class Employee extends Person {
private double Salary;
public Employee(){}
public Employee(String a){
	this.Name=a;
}


public double getSalary() {
	return Salary;
}

public void setSalary(double salary) {
	Salary = salary;
}
public String toString(){
	return super.Name+"is an instructor with salary"+this.Salary;
}
}
