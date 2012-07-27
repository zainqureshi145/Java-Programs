
public class Driver {

	
	public static void main(String[] args) 
	{
		Vehicle H = new Vehicle();
		H.setName("Honda Civic");
		H.setPassengers(4);
		H.setSpeed(320);
		
		System.out.println(H.getName() +" can accomodate " +H.getPassengers() + " Passengers and its Top Speed is "+ H.getSpeed() + " Km/h.");
		
	}

}
