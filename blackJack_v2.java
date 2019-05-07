import java.util.*;
public class blackJack_v2
{
	static Scanner myObj = new Scanner(System.in);
	static char ask ='y';	
    static int user_Total = 0;
    static int computer_Total = 0;

	public static void main(String[] args) 
	{
	   System.out.print("Do you want to play a game of BlackJack y/n?: ");
	   ask = (myObj.nextLine().trim().toLowerCase()).charAt(0);
	   if(ask=='y')
	   {
		   playBlackJack();
	   }
	}
    public static card_new hitOrStand()
    {
    	System.out.print("Hit or Stand?");
 	    ask = (myObj.nextLine().trim().toLowerCase()).charAt(0);    
 		if(ask =='h')
 		{
 			return card_new.cardGenerator();
 		}
 		return new card_new();
    }
    	
    
	public static void playBlackJack()
	{
		card_new temp;
	    temp=card_new.cardGenerator();
	    computer_Total +=temp.value;
	    System.out.println("Computer's card: "+temp.name);
	   do
 	    {
	    	temp=hitOrStand();
	    	user_Total += temp.value;
		    System.out.println("user's card: "+temp.name);
 	    }while(user_Total < 21 && temp.value != 0);
	    temp=card_new.cardGenerator();
	    computer_Total +=temp.value;
	    System.out.println("Computer's card: "+temp.name);
	    System.out.println("Computer card total: "+computer_Total);
	    System.out.println("User card total: "+user_Total);
	    if(user_Total>21)
	    	System.out.println("BUST! Computer wins");
	    else if (user_Total == computer_Total)
	    	System.out.println("Tie");
	    else if (user_Total > computer_Total)
	    	System.out.println("User wins");
	    else
	    	System.out.println("Computer wins");
	}
}


 class card_new
{
	String name;
	int value;
	public card_new(String n,int v)
	{
		value=v;
		name=n;
	}
	public card_new()
	{
		name="";
		value=0;
	}
	public static card_new cardGenerator()
	{
		int v;
		String n;
	    final String[] cards = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		int rand = (int)(Math.random() * 13);
	//	System.out.println("random # generated "+ rand);
		n = cards[rand];
		if(rand > 9)
			v = 10;
		else
			v = rand + 1;
	//	System.out.println("value - "+ v + " name - " + n);
		card_new Card = new card_new(n,v);
		return Card;	
	}
}
