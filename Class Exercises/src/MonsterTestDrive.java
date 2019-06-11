public class MonsterTestDrive 
{
	public static void main(String [] args)
	{
		Monster []ma= new Monster[3];
		ma[0] = new Vampire();
		ma[1] = new Dragon2();
		ma[2] = new Monster();
		for (int x=0; x<3 ;x++)
		{
			ma[x].frighten(x);
		}
	}
}
class Monster
{
	boolean frighten (int degree)
	{
		System.out.println("arrrrgh");
		return true;
	}
}
class Vampire extends Monster
{
	boolean frighten (byte degree)
	{
		System.out.println("a bite");
		return true;
	}
}
class Dragon2 extends Monster
{
	boolean frighten (int degree)
	{
		System.out.println("breath fire");
		return true;
	}
}
