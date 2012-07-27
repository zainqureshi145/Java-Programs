public class Test {
	public static void main(String[] args) {
		// uncommenting the following line should produce a compile error.
		// This is for testing of an abstract class.
		// Person p = new Person("George");

		// final int MAX_HEADCOUNT = 20;
		Person[] person_array = new Person[20];

		// A student named Peter
		person_array[0] = new Student("Peter", "Susan", person_array);

		// An instructor named Peter
		person_array[1] = new Instructor("Peter", 20000);

		// An instructor named Sandy and her salary
		person_array[2] = new Instructor("Sandy", 25000);

		// A janitor named Bob
		person_array[3] = new Employee("Janitor Bob");

		// A student named Tom and his instructor is Peter.
		// The constructor needs to do three things:
		// 1: sets this student’s “TeacherName” field to be “Peter”,
		// 2: finds out the ID of the 1st instructor
		// who exists in the person_array so far and named "Peter",
		// and assign it to this student's “TeacherID” field.
		// Set it to be 0 if no instructor named Peter is found in the
		// person_array so far
		// 3: records this student’s ID in the instructor’s StudentArray if such
		// an instructor is found
		// right after executing the following statement
		// person_array[4].TeacherID = 2
		// person_array[4].TeacherName = “Peter”
		// person_array[1].StudentArray[0] = 5
		person_array[4] = new Student("Tom", "Peter", person_array);

		// A student named Maggie and her instructor is Susan
		// right after executing the following statement
		// person_array[5].TeacherID = 0
		// person_array[5].TeacherName = “Susan”
		person_array[5] = new Student("Maggie", "Susan", person_array);

		// An instructor named Susan and her salary
		person_array[6] = new Instructor("Susan", 40000);

		// After all objects are created,
		// instructors need to fill their students arrays,
		// and some students need to fill their TeacherIDs now,
		// since there may exist cases that when a Student object is created
		// with instructor’s name,
		// the corresponding Instructor object hasn’t been created and is not in
		// the person_array.
		// For example, person_array[6] is created after person_array[5].
		// You need to record person_array[5]’s ID in person_array[6]’s
		// studentArray field,
		// and record person_array[6]’s ID in person_array[5]’s TeacherID field.
		// Note: if there are more than one Instructor objects
		// having the same names as a Student object’s TeacherName,
		// it’ll always be the first one’s ID assigned to the Student object’s
		// TeacherID
		// Instructor.findStudents(person_array);

		System.out.println(" ID and name of all personnel in the array \n");
		for (int i = 0; i < Person.getMaxID(); i++) {
			System.out.println(i + ") " + person_array[i].toString());
		}
	}
}
