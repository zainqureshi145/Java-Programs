
public class Student extends Person{
	private int currentYear;
    Student(String a, String b)
{
	super.setFirstName(a);
	super.setLastName(b);
	currentYear = 0;
}
public int getCurrentYear() {
	return currentYear;
}
public void setCurrentYear(int currentYear) {
	this.currentYear = currentYear;
}

}
