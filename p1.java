import java.util.Scanner;
public class p1
{
	public static void main (String []args)
	{
	   Drink d = new Drink();
	   d.getInputs();
	   System.out.println(d.makeDrink());
	}   
}  
class Drink
{
	private String flavor;
	private String size;
	   
	public void getInputs ()
	{
		System.out.println("Enter Drink Flavor");
		Scanner sc = new Scanner(System.in);
		flavor = sc.nextLine();
		System.out.println("Enter Drink Size");
		size = sc.nextLine();
	}
	public String makeDrink()
	{
		String combine = " is a whole lotta " + flavor + " " + size + " is a whole lotta ";  
		return combine;
	}
}