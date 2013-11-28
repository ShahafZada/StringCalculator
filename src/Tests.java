import static org.junit.Assert.*;

import org.junit.Test;


public class Tests {
	int result = 0;
	StringCalculator calculator = new StringCalculator();
	@Test
	public void test() {
		result = calculator.Add("");
		assertEquals(0, result);
	}

}
