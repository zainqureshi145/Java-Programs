

public abstract class Person {
	private static int ID;
	private int id;
	private String Name;
	
	
	public Person(String name0){
		Name=name0;		
		id = ++ID;
	}
	
	public String getName(){
		return Name;
	}
	public void setName(String name0){
		Name =name0;		
	}
	
	public int getID(){
		return id;
	}
	
	
	public String toString(){
		return "";
		
	}
	
	
	static int getMaxID(){
		return ID;
	}

}
