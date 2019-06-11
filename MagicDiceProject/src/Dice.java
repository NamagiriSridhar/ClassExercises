
import java.util.Random;

public class Dice { //Dice means one single dice for our purpose
    private int value;
    
    public Dice rollDice() 
    {
        value = 1 + (int)(Math.random() * 6); //Generating a random number between 1 and 6
        return this; //for test purposes
    }

    public int getValue() 
    {
        return value;
    }
}
