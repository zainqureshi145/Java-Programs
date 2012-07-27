public class ToStringDemo {

	public static void main(String args[]) {
		PointCoordinates point = new PointCoordinates(10, 10);
		// using the Default Object.toString() Method
		System.out.println("Object toString() method : " + point);
		// implicitly call toString() on object as part of string concatenation
		String s = point + " testing";
		System.out.println(s);
	}
}