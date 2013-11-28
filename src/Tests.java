import static org.junit.Assert.*;

import org.junit.Test;


public class Tests {
	int result = 0;
	StringCalculator calculator = new StringCalculator();
	@Test
	public void testEmptyExpression() {
		result = calculator.Add("");
		assertEquals(0, result);
	}
	
	@Test
	public void testOneAgeumentExpression() {
		result = calculator.Add("1");
		assertEquals(1, result);
	}
	
	@Test
	public void testTwoAgeumentExpression() {
		result = calculator.Add("1,2");
		assertEquals(3, result);
	}
	
	@Test
	public void testMultipleAgeumentExpression() {
		result = calculator.Add("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15");
		assertEquals(120, result);
	}
	

}
