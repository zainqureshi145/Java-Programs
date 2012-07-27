
public class Driver {

	public static void main(String[] args) {
		Vehicle First = new Vehicle();
		First.setName("City");
		First.setModel(2012);
		First.setManufatured(12);
		
		System.out.println("The Vehicle Name Is " +First.getName() +" Model is " +First.getModel() +" Manufacturing Date is " +First.getManufatured());

	}

}
