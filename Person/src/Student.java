
public class Student extends Person
{
	private int currentYear;
	Student(String x, String y)
	{
		
		currentYear = 0;
		System.out.println("Student Called");
	}
	public int getCurrentYear() {
		return currentYear;
	}
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	

}
