
public class Girl 
{
	private String girlName;
	
	public Girl(String name)                 // this shit is Constructor, Constructor name should be named as class name
	{                          
		girlName = name;       
	}                          
	
	
	public void setName (String name)
	{
		girlName = name;
	}
	
	
	public String getName()
	{
		return girlName;
	}
	
	
	public void saying()
	{
		System.out.printf("Your Firts GF was %s\n", getName());
	}
	
	
}
