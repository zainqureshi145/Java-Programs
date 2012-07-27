public class Student extends Person {
	private int Teacherid;
	private String Teachername;
	static int counter = 1;
	Student(){
		counter++;
	}

	public Student(String Sname, String Tname, Person[] person) {
		super.setName(Sname);
		this.Teachername = Tname;

	}

	public Student(String name) {

	}

	public int getTeacherId() {
		return Teacherid;
	}

	public void setTeacherId(int teacherId) {
		this.Teacherid = teacherId;
	}

	public String getTeacherName() {
		return Teachername;
	}

	public void setTeacherName(String teacherName) {
		Teachername = teacherName;
	}

	public String toString() {

		return super.getName() + " is a student " + " whose teacher name is "
				+ this.Teachername +this.Teacherid +" counter is "+counter;
	}

}
