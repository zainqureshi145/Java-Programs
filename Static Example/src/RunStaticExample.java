
public class RunStaticExample {

	public static void main(String[] args) {
		StaticExample se1 = new StaticExample();
		StaticExample se2 = new StaticExample();
		StaticExample se3 = new StaticExample();
		
		System.out.println("Value of Static Counter for se1 is " +se1.staticCounter);
		System.out.println("Value of Static Counter for se2 is " +se2.staticCounter);
		System.out.println("Value of Static Counter for se3 is " +se3.staticCounter);
		//Also records the record of total objects created
		System.out.println("Value of Counter for se1 is " +se1.counter);
		System.out.println("Value of Counter for se2 is " +se2.counter);
		System.out.println("Value of Counter for se3 is " +se3.counter);
		
		StaticExample.staticCounter = 200;
		System.out.println("Value of Static Counter for se1 is " +se1.staticCounter);
		System.out.println("Value of Static Counter for se2 is " +se2.staticCounter);
		System.out.println("Value of Static Counter for se3 is " +se3.staticCounter);
	}

}
