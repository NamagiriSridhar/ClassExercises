
import java.util.Random;

public class Dice { //Dice means one single dice for our purpose
//    attributes
    private int value;
    
//    methods
    public void rollDice() {
        value = 1 + (int)(Math.random() * 6);
    }

    public int getValue() {
        return value;
    }
    
    

}
