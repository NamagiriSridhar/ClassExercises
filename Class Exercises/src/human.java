
public class human 
{
	private int honesty;
	private int love;
	private int compassion;
	private int selfawareness;
	private int happiness;
	public int howhumanyouare()
	{
		return this.honesty + this.love + this.compassion + this.happiness + this.selfawareness;
	}
	public human(int hy, int l, int c, int h, int s)
	{
		this.honesty = hy;
		this.love = l;
		this.compassion =c;
		this.happiness =h;
		this.selfawareness=s;
	}
	public void helpAnEarthling()
	{
		this.compassion += 100;
		this.happiness +=50;
	}
	public void findYourSoulmate()
	{
		this.love +=100;
		this.happiness +=100;
	}
   public void findoutwhoyouare()
   {
	   this.selfawareness +=100;
	   this.happiness+=100;
   }
}
