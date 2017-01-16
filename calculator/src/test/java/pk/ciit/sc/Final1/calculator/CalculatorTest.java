package pk.ciit.sc.Final1.calculator;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	Calculator cal=new Calculator();

	@Test
	public void testMax() {
		int res=cal.findMax(1, 7, 6);
		assertEquals(7, res);
		
	}
	/**
	 * this method could not find max values when all values are less than 0(<0)
	 */
	@Test
	public void testMaxFailtoFind() {
		int res=cal.findMax(-1, -17, -16);
		assertEquals(-1, res);
		
	}

	@Test
	public void testSquare() {
		int res=cal.square(6);
		assertEquals(36, res);
		
	}
	
	/**
	 * this test case skiiped due Out of range value
	 */
	public void testSquareSkipped(){
		int res=cal.square(0);
		assertEquals(0, res);
	}
	
	@Ignore
	@Test (expected = IllegalArgumentException .class)
	public void testDevideException() throws IllegalArgumentException {
		cal.square(15);
		
	}

}
