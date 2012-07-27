
public class Person {
	Person(){
		
	}
	private String firstName = "";
	private String lastName = "";
	
	Person(String fName, String lName){
		firstName = fName;
		lastName = lName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
