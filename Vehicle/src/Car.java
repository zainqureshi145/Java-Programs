
class Car extends Vehicle {

	private int carNo = 10;
	public void printCarInfo() {
		System.out.println("Car number: " + carNo);
		System.out.println("No of Tyres: " + noOfTyres); // Inherited.
		//  System.out.println("accessories: "    + accessories); // Not Inherited.
		System.out.println("accessories: " + isPresent()); // Inherited.
		//        System.out.println("Brand: "     + getBrand());  // Not Inherited.
		System.out.println("Brand: " + brand); // Inherited.
		//  System.out.println("Counter: "    + counter);     // Not Inherited.
		getNoOfVehicles(); // Inherited.
	}
}