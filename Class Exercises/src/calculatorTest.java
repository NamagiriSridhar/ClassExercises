import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculatorTest {
    //calculator c = new calculator();
    
	@Test
	void add() {
		assertEquals(6,calculator.add(2,2));
	}

}
