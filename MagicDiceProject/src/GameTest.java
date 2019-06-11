import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class GameTest extends Game {

	Game g = new Game();
	@Test
	void testFillHashMap()
	{
    	Map<Integer, Integer> test = new HashMap<Integer, Integer>();    	   
		assertNotNull(g.fillHashMap(1,test));
	}
	
	@Test
	void testStartGame()
	{
		assertTrue((g.startGame().equals("Win"))||(g.startGame().equals("Lose")));
	}
	
	@Test
	void testAddDice()
	{
		assertTrue(g.addDice() > 1);
		assertTrue(g.addDice() < 13);	
	}
}
