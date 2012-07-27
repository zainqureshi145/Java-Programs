public class TV extends HomeDevice implements Switchable{//TV
	TV(String Name) {
		super(Name);
	}
	public void switchOff(){
		System.out.println("Switching Off TV in " +Name);
		
	}
	public void switchOn(){
		System.out.println("Warming On TV in " +Name);
		
	}
	public String toString(){
		return "Tv in " +Name;
		
	}


}
