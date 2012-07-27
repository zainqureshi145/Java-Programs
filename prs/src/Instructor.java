

public class Instructor extends Employee{
	int StudentIDArray[];
	
	public Instructor(String name0){
		super(name0);
		StudentIDArray =  new int[10];
	}
	
	public Instructor(String name0, Double salary0){
		super(name0,salary0);
		StudentIDArray =  new int[10];
	}
	
	public String toString(){
		return "The Instrutor name is "+getName();	
	}
	public int [] getStudentIDArrayRef(){
		return StudentIDArray;
	}
	public boolean isMyStudent(Student stu){
		boolean flag = false;
		if(this.getName().equals(stu.getName())){
			flag = true; 
		}
		return flag;
	}
	
	
	public void findMyStudents(Person[] personArray){
		int [] refToArray; 
		for(int i=0;i<personArray.length;i++){
			if(personArray[i] instanceof Student){
			Student stu = (Student)personArray[i];
			if(isMyStudent(stu)){
				refToArray = this.getStudentIDArrayRef();
				for(int j=0; j<refToArray.length;j++){
					if(refToArray[j] != 0){
						refToArray[j] = stu.getID(); 
					}
				}
			}	
			}
		}
	}

	public static void findStudents(Person[] personArray) {
		// job 1: fill StudentIDArray
		// job 2: set teacherID to matching 1st instructor
		for(int i=0;i<personArray.length;i++){
			if(personArray[i]instanceof Instructor){
				Instructor me = (Instructor)personArray[i];
				me.findMyStudents(personArray);
			}else if(personArray[i] instanceof Student){
				String tName;
				Student st = (Student)personArray[i];
				if(st.getTeacherName()!= null){
					tName = st.getTeacherName();
					st.setTeachID(st.findTeacher(tName, personArray));
				}
			}
			
		}
		}
		
	
	
}
