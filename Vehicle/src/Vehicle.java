
class Vehicle {

	// Instance fields
	int noOfTyres; // no of tyres
	private boolean accessories; // check if accessorees present or not
	protected String brand; // Brand of the car
	// Static fields
	private static int counter; // No of Vehicle objects created
	// Constructor
	Vehicle() {
		System.out.println("Constructor of the Super class called");
		noOfTyres = 5;
		accessories = true;
		brand = "BMW";
		counter++;
	}
	// Instance methods
	public void switchOn() {
		accessories = true;
	}
	public void switchOff() {
		accessories = false;
	}
	public boolean isPresent() {
		return accessories;
	}
	public void getBrand() {
		System.out.println("Vehicle Brand: " + brand);
	}
	// Static methods
	public static void getNoOfVehicles() {
		System.out.println("Number of Vehicles: " + counter);
	}
}