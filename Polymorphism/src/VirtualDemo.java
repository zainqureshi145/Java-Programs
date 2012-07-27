public class VirtualDemo
{
   public static void main(String [] args)
   {
      Salary s = new Salary("Zubair", "Islamabad,  Punjab",3, 3600.00);
      Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
      System.out.println("Call mailCheck usingSalary reference --");
      s.mailCheck();
      System.out.println("\n Call mailCheck usingEmployee reference--");
      e.mailCheck();
    }
}