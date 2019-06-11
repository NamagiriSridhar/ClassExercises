import java.util.*;
public class blackJack_v1 
{
	static Scanner myObj = new Scanner(System.in);
	static char ask ='y';	
	static int user_cards_idx = 0;
	
	public static void main(String[] args) 
	{
	   System.out.print("Do you want to play a game of BlackJack y/n?: ");
	   ask = (myObj.nextLine().trim().toLowerCase()).charAt(0);
	   if(ask=='y')
	   {
		   playBlackJack();
	   }
	}
	
	public static int runningTotalCard(card[] cardArray)
	{
		int CardSum=0;
		for(card c : cardArray) {
			CardSum += c.value;
		}
		return CardSum;	
	}
	
    public static int hitOrStand(card[] cardArray)
    {
    	System.out.print("Hit or Stand?");
 	    ask = (myObj.nextLine().trim().toLowerCase()).charAt(0);    
 		if(ask=='h')
 		{
 			cardArray[user_cards_idx] = card.cardGenerator();
 			System.out.println("User's card: "+ cardArray[user_cards_idx++].value);
 		}
 		else if (ask== 's')
 		{
 			return 0;
 		}	
 		return 1;
    }
    	
    
	public static void playBlackJack()
	{
		card user_cards[]=new card[10];
		for(int i=0;i<user_cards.length;i++)
			user_cards[i] = new card();
	    card computer_cards[]=new card[2];
	    computer_cards[0]=card.cardGenerator();
	    System.out.println("Computer's card: "+computer_cards[0].value);
	    do
 	    {
	    	if(hitOrStand(user_cards)==0) break;
	    	
 	    }while(runningTotalCard(user_cards)< 21);
	    computer_cards[1]=card.cardGenerator();
	    System.out.println("Computer's card: "+computer_cards[1].value);
	    int cTotal= runningTotalCard(computer_cards);
	    int uTotal=runningTotalCard(user_cards);
	    System.out.println("Computer card total: "+cTotal);
	    System.out.println("User card total: "+uTotal);
	    if(uTotal>21)
	    	System.out.println("BUST! Computer wins");
	    else if (uTotal == cTotal)
	    	System.out.println("Tie");
	    else if (uTotal > cTotal)
	    	System.out.println("User wins");
	    else
	    	System.out.println("Computer wins");

	}
}


 class card
{
	int value;
	public card(int v)
	{
		value=v;
	}
	public card()
	{
		value=0;
	}
	public static card cardGenerator()
	{
		card Card = new card((int)(Math.random() * 10 + 1));
		return Card;	
	}
}
