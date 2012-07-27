import java.util.ArrayList;

public class HomeControlLauncher {//HomeControllLauncher
	ArrayList<HomeDevice> things = new ArrayList<HomeDevice>();//global access

	public void goToSleep() {
		//For Loop
		for(HomeDevice thing : things)
		if(thing instanceof Switchable)
		((Switchable) thing).switchOff();	
		
	}

	public void wakeUp() {
		//For Loop
		for(HomeDevice thing : things )
		if(thing instanceof Switchable)
		((Switchable) thing).switchOn();
		
	}

	public void add(HomeDevice thing) {
		//Print
		System.out.println("Adding " + thing);
		things.add(thing);
	}

	public static void main(String[] args) {
		HomeControlLauncher hc = new HomeControlLauncher();
		hc.add(new RoomLight("bedroom"));
		hc.add(new EmergencyLight("hallway"));
		hc.add(new CDPlayer("bedroom"));
		hc.add(new TV("sitting room"));
		hc.goToSleep();
		hc.wakeUp();
	}
}
