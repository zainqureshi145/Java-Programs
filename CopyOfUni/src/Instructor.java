public class Instructor extends Employee {
	int[] StudentId = new int[10];
	String InstructorName;

	public Instructor(String IName, int x) {
		this.InstructorName = IName;
		this.setSalary(x);
	}

	public String getInstructorName() {
		return Name;
	}

	public void setInstructorName(String Name) {
		InstructorName = Name;
	}
	
	public String toString() {
		return this.InstructorName + " is Instructor having Salary "
				+ super.Salary;
	}
}
