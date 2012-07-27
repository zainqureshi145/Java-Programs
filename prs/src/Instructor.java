public class Instructor extends Employee {
	int[] StudentId = new int[10];
	String InstructorName;
	static int counter = 1;
	Instructor(){
		counter++;
	}

	public Instructor(String Name, int i) {
		this.InstructorName = Name;
		super.setSalary(i);
	}

	/*
	 * public Instructor(String a,int i){ this.InstructorName=a;
	 * super.setSalary(i); }
	 */
	
	public String toString() {
		return this.InstructorName + " is instructor having salary = " + super.getSalary() +" " +counter;
	}

	public static void findStudents(Person[] person_array) {

	}
}
