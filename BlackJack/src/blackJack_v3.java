import java.util.*;
 
public class blackJack_v3
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
    	System.out.print("Hit or Stand? ");
 	    ask = (myObj.nextLine().trim().toLowerCase()).charAt(0);    
 		if(ask =='h')
 		{
 			return card_new.cardGenerator();
 		}
 		return new card_new();
    }
    	
    
	public static void playBlackJack()
	{
	   card_new user_card;
	   card_new computer_card;
	   do
 	    {
	       System.out.println("Computer's turn"); 	
	       computer_card=hitOrStand();
		   computer_Total +=computer_card.value;
		//   System.out.println("test...."+computer_card.value);
		   System.out.println("Computer's card: "+computer_card.name);
		   System.out.println("User's turn"); 	
		   user_card=hitOrStand();
		   user_Total +=user_card.value;
		   System.out.println("User's card "+user_card.name);
	//	   System.out.println("test...."+user_card.value);
 	    } while(user_Total < 21 && computer_Total < 21 && user_card.value !=0 && computer_card.value != 0); 
	    
	    System.out.println("Computer card total: "+computer_Total);
	    System.out.println("User card total: "+user_Total);
	    if(user_Total>21)
	    	System.out.println("BUST! Computer wins");
	    else if(computer_Total>21)
	    	System.out.println("BUST! User wins");
	    else if (user_Total == computer_Total)
	    	System.out.println("Tie");
	    else if (user_Total > computer_Total)
	    	System.out.println("User wins");
	    else
	    	System.out.println("Computer wins");
	}
}
