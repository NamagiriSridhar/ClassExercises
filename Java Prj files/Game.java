import java.util.HashMap;

public class Game
{
    private Dice dice1 = new Dice();
    private Dice dice2 = new Dice();
    private HashMap<Integer, Integer> trySum = new HashMap<Integer, Integer>();
    public static void main(String[] args) 
    {
        Game g = new Game();
        String Winningstatus = g.startGame();
        System.out.println(" You "+ Winningstatus +" !!!");
    }
    
    private String startGame() 
    {   
        //System.out.println("Testing HashMap "+ trySum);    
        fillHashMap(1);
        //System.out.println("Testing HashMap "+ trySum);    
        if(trySum.size()==1)
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
                final int NUMBER_OF_TRIES = 3;
                System.out.println(" POINT is " + firstTryVal);
                for ( int i=1; i<=NUMBER_OF_TRIES;i++) {
                    fillHashMap(i+1);
          //          System.out.println("Testing HashMap "+ trySum);    
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
    
    public void fillHashMap(Integer t) 
    {
        //System.out.println("Testing HashMap "+ trySum);    
        trySum.put(t,addDice());    
        //System.out.println("Testing HashMap "+ trySum);    
    }
}