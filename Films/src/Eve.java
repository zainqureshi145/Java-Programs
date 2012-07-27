
public class Eve {

	public static void main(String[] args) 
	{
		Film Adult = new Film();
		Adult.setCalled("Road to Perdition");
		Adult.setMinutes(117);
		Film Kids = new Film();
		Kids.setCalled("Shrek");
		Kids.setMinutes(133);
		
		System.out.println("The Kids are watching "+Kids.getCalled());
		System.out.println("The Adulds are watching "+Adult.getCalled());
		int before = Kids.getMinutes() - Adult.getMinutes();
		System.out.println("The Adults will be through "+before +" minutes ahead");
		
	}

}
