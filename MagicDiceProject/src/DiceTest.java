import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiceTest extends Dice {
	Dice d = new Dice();
	@Test
	void testRollDice() 
	{
		Dice test = d.rollDice(); 
		assertTrue(test instanceof Dice);
	}

	@Test
	void testGetValue() 
	{
		assertTrue(d.rollDice().getValue() > 0);
		assertTrue(d.rollDice().getValue() < 7);
	}

}
