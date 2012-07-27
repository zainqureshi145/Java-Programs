
public class Teacher extends Person
{
	private int taxFileNo;
	Teacher()
	{
		taxFileNo = 0;
		//System.out.println("Teacher Called");
	}
	public int getTaxFileNo() {
		return taxFileNo;
	}
	public void setTaxFileNo(int taxFileNo) {
		this.taxFileNo = taxFileNo;
	}
	

}
