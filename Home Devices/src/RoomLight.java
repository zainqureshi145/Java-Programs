public class RoomLight extends HouseLight implements Switchable{// RoomLight
	RoomLight(String Name) {
		super(Name);
	}
	public void switchOff(){
		System.out.println("Switching Off Lights in " +Name);
	}
	public void switchOn(){
		System.out.println("Switching On Lights in " +Name);
		
	}
	public String toString(){
		return "Lights in " +Name;
		
	}

}
