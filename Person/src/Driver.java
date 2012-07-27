/*
public class Driver {

	
	public static void main(String[] args)
	{
		Student S =new Student();
		S.setLastName("Ahmed");
		System.out.println(S.getLastName());
		

	}

}*/


public class Driver {

	
	public static void main(String[] args)
	{
		Student S = new Student("Zubair", "Ahmed");
		
		System.out.println(S.getLastName());
		

	}

}
