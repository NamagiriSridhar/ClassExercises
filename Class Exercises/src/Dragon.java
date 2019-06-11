
public class Dragon {
	private String firePower;
	private boolean friendly;
	private boolean isABaby;
	private int flyingSpeed;
	private int noiseLevel;
	public Dragon(String f, boolean fy, boolean b, int fs, int nl)
	{
		this.firePower = f;
		this.friendly = fy;
		this.isABaby = b;
		this.flyingSpeed = fs;
		this.noiseLevel = nl;
	}
	public Dragon AllGrownUp()
	{
		this.isABaby = false;
		return this;
	}
	public void trainADragon()
	{
		this.friendly = true;
		this.noiseLevel-=50;
	}
	public static void main(String[] args)
	{
		Dragon d1 = new Dragon("Massive",true,true,100,200);
		d1.AllGrownUp().trainADragon();
		
		
	}
	
}
