public abstract  class cat 
{
	private boolean pettable;	
	private int speedInMPH;
	
	public boolean isPettable() 
	{
		return pettable;
	}
	public int getSpeedInMPH() 
	{
		return speedInMPH;
	}
	abstract public void tellmeabtMyself();
	abstract public void whatDoISay();
	
}

class siamese extends cat
{
	String furColor;
	boolean playFetch;
	@Override
	public void whatDoISay() {
		System.out.println("Meow.....Purrr.....Meowwwwww");
	}
	public void tellmeabtMyself()
	{
		System.out.println("Am I pettable? " + super.isPettable());
		System.out.println("Speed "+ super.getSpeedInMPH());
		System.out.println("Fur Color " + furColor);
		System.out.println("Can I play Fetch?" + playFetch);
	}	
}

class lion extends cat
{
	int manelengthIninches;
	String gender;
	@Override
	public void tellmeabtMyself()
	{
		System.out.println("Am I pettable? " + super.isPettable());
		System.out.println("Speed "+ super.getSpeedInMPH());	
		if (this.gender!= "male")
		{
			System.out.println("Mane length " +manelengthIninches);
		}
		System.out.println(gender);
	}

	@Override
	public void whatDoISay() {
		System.out.println("Roarrrrrr....");
	}
}


