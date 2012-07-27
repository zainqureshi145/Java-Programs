
public class Driver {

	
	public static void main(String[] args) {
		Student s = new Student("Zubair", "Ahmed");
		Person p = new Person("Hamid", "Karzai");
		Teacher t = new Teacher();
		t.setTaxFileNo(19);
		System.out.println(" Name of The Student is " +s.getFirstName() +" "+ s.getLastName());
		System.out.println(" Name of The Teacher is " +p.getFirstName() +" "+ p.getLastName());
		System.out.println(" Tax File Number of "+p.getFirstName() +" "+ p.getLastName() +" is " +t.getTaxFileNo());
	}

}
