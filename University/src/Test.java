public class Test {
	public static void main(String[] args) {
		// Person p = new Person("George");//uncomment this to check abstract

		final int MAX = 7;
		Person[] array = new Person[MAX];

		array[0] = new Student("Peter", "Peter");
		array[1] = new Instructor("Peter", 0000);
		array[2] = new Instructor("Sandy", 25000);
		array[3] = new Student("Janitor Bob","");
		array[4] = new Student("Tom", "Peter");
		array[5] = new Student("Magie", "Sasan");
		array[6] = new Instructor("Susan", 40000);

		System.out.println("ID and Name of all Personnel in the Array \n");
		for (int i = 0; i < Person.getMaxID(); i++) {
			System.out.println(i + ")" + array[i]);
		}

	}
}
