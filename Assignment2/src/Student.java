
public class Student extends Person {
	private int currentYear;
	Student(String fName, String lName){
		super(fName, lName);
		
	}
	public int getCurrentYear() {
		return currentYear;
	}
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

}
