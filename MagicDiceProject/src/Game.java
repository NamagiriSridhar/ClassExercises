import java.util.HashMap;
import java.util.Map;

public class Game
{
    private Dice dice1 = new Dice(); 
    private Dice dice2 = new Dice();
    
    public static void main(String[] args) 
    {
        Game g = new Game();
        String Winningstatus = g.startGame();
        System.out.println(" You "+ Winningstatus +" !!!");
    }
    
    public String startGame() 
    {   
    	//the hashmap holds all the Key(first or second try) and the sum of the two dice as value for the corresponding try .
    	Map<Integer, Integer> trySum = new HashMap<Integer, Integer>();    	   
       // System.out.println("Testing HashMap "+ trySum);   
    	//To fill the hashmap for a try. random number is generated for 2 dices and then summed up and added as value in hashmap
        trySum=fillHashMap(1,trySum);
        //System.out.println("Testing HashMap "+ trySum);    
        if(trySum.size()==1) //checking if it is the second try
        {
            int firstTryVal = trySum.get(1);
            if(firstTryVal == 7 || firstTryVal == 11)
            {
                return "Win";
            }
            else if(firstTryVal == 2 || firstTryVal == 3 || firstTryVal == 12)
            {
                return "Lose";
            }
            else
            {
                final int NUMBER_OF_TRIES = 3; //3 more tries
                System.out.println(" POINT is " + firstTryVal);
                for ( int i=1; i<=NUMBER_OF_TRIES;i++) {
                  trySum =  fillHashMap(i+1,trySum);
          //         System.out.println("Testing HashMap "+ trySum); 
                  //the user wins if he is able to get again the value he obtained in first try in 3 more tries
                    System.out.println(" POINT is " + firstTryVal); 
                    if(trySum.get(i+1)== firstTryVal)
                    {
                        return "Win";
                    }
                }
            }
        }
        return "Lose";    
    }
    

    public int addDice() 
    {
        dice1.rollDice();
        dice2.rollDice();
        int sum = dice1.getValue() + dice2.getValue();
        System.out.print("You rolled "+ sum);
        return sum;
    }
    
    public Map<Integer,Integer> fillHashMap(Integer t, Map<Integer,Integer> h) 
    {
        //System.out.println("Testing HashMap "+ h); 
        h.put(t,addDice());  
        //System.out.println("Testing HashMap "+ h);    
        return h;
    }
}