

public class Test {
	
	public static void main(String args[]){
	    // uncommenting the following line should produce a compile error. 
        // This is for testing of an abstract class.
        // Person p = new Person("George");

        final int MAX_HEADCOUNT = 20;
        Person[] person_array = new Person[MAX_HEADCOUNT];

        // A student named Peter
        person_array[0] = new Student("Peter");
        person_array[1] = new Student("Tom");
        System.out.println(Person.getMaxID());

}
}
