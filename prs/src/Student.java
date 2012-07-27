

public class Student extends Person {
	private int TeacherID ;
	private String TeacherName;
	
	public Student(String name0){
		super(name0);
		
	}
	public Student(String sName0, String tName0, Person [] person_array){
		super(sName0);
		TeacherName = tName0;
		TeacherID = findTeacher(tName0,person_array);
	}
	
	public void setTeachID(int teacherID0){
		TeacherID = teacherID0;
	}
	public String getTeacherName(){
		return TeacherName;
	}
	
	
	
	public int findTeacher(String tName, Person [] person_array) {
		
		int id = 0;
		for(int i=0;i<person_array.length;i++){
			if(person_array[i] instanceof Instructor){
				Instructor inst = (Instructor) person_array[i];
				if(inst.getName().equals(tName)){
				id = inst.getID();
				break;
				}
			}
		}
		return id;
	}
	public String toString(){
		String str;
		boolean instructor;
		str = getName()+" is a Student ";
		if(TeacherName!=null){
			str += "whose instructor is "+TeacherName+", and his/her instructor's ID is "+TeacherID;
		}
		return str;		
	}
	
	

}
