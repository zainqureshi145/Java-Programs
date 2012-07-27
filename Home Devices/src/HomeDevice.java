public abstract class HomeDevice { //HomeDevice

	String Name;

	public HomeDevice(String roomName) {
		this.Name = roomName;
	}

	public abstract String toString();
}
