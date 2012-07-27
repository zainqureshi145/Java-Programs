public abstract class Person {
	private int Id;
	//private static int ID;
	private String Name;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public abstract String toString();

	public int getID() {

		return this.Id;
	}

	/*public static int getMaxID() {

		return 7;
	}*/
	static int counter = 1;
	Person(){
		counter++;
	}

}
