
public class Car {
	private String make;
	private String model;
	private String color;
	private int manufacturingYr;
	private boolean convertible;
	public Car(String mk, String m, String cr, int y, boolean c)
	{
		this.make = mk;
		this.model= m;
		this.color= cr;
		this.manufacturingYr = y;
		this.convertible = c;
	}
	public void changecolor(String cr)
	{
		this.color = cr;
	}
	public void popthetop()
	{
		if(this.convertible==true)
		{
			 System.out.print("Dude the weather is perfect. Open the top. Enjoy!!!");
		}
	}
}
