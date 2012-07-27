public class Test {
	public static void main(String[] args) {
		
		Person[] person_array = new Person[20];

		
		person_array[0] = new Student("Peter", "Susan", person_array);

		
		person_array[1] = new Instructor("Peter", 20000);

		
		person_array[2] = new Instructor("Sandy", 25000);

	
		person_array[3] = new Employee("Janitor Bob");

		
		person_array[4] = new Student("Tom", "Peter", person_array);

		
		person_array[5] = new Student("Maggie", "Susan", person_array);

		
		person_array[6] = new Instructor("Susan", 40000);

		System.out.println(" ID and name of all personnel in the array \n");
		for (int i = 0; i < 7; i++) {
			System.out.println(i + ") " + person_array[i].toString());
		}
	}
}
