public class Student extends Person {
	public int TeacherId;
	public String TeacherName;

	public Student(String Studentname, String Teachername, Person[] person) {
		super.Name = Studentname;
		this.TeacherName = Teachername;
	}

	public int getTeacherId() {
		return TeacherId;
	}

	public void setTeacherId(int teacherId) {
		TeacherId = teacherId;
	}

	public String getTeacherName() {
		return TeacherName;
	}

	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}

	public String toString() {

		return super.Name + " is a Student " + " whose Teacher is "
				+ this.TeacherName + " and " +this.TeacherName+"'s Identity Number is " + this.TeacherId;
	}

}
