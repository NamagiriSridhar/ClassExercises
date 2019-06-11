
public abstract class Mammal 
{
	public String whoAmI() 
	{
		String name = this.toString();
		name = name.substring(0,name.indexOf('@', 0));
		return name;
	}
	public abstract void mate();
	public abstract void gestate();
	public abstract void nurse();
}
class Sloth extends Mammal
{
	int numberOfToes;
	@Override
	public void mate() {
		System.out.println("Mating details of " + this.whoAmI());
		
	}
	@Override
	public void gestate() {
		
	}
	@Override
	public void nurse() {
		
	}
	
}
