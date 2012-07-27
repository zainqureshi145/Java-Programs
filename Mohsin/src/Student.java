
public class Student extends Person {
private int Teacherid;
private String Teachername;


public Student(String Sname,String Tname,Person person[]){
	super.Name=Sname;
	this.Teachername=Tname;

}



public Student(String name) {
	
}


public int getTeacherId() {
	return Teacherid;
}
public void setTeacherId(int teacherId) {
	Teacherid = teacherId;
}
public String getTeacherName() {
	return Teachername;
}
public void setTeacherName(String teacherName) {
	Teachername = teacherName;
}
public String toString(){
	
	return super.Name+" is a student"+"whose teacher name is"+this.Teachername;
}

}
