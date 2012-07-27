
public class Instructor extends Employee {
	int[] StudentId=new int[10];
	String InstructorName;
	public Instructor(String Name){
		this.InstructorName = Name;
		}
	
public Instructor(String a,int i){
	this.InstructorName=a;
	super.setSalary(i);
}
public String toString(){
	return this.getName()+"is instructor having salary = "+super.getSalary();
}
public static void findStudents(Person[] person_array) {
	
}
}
