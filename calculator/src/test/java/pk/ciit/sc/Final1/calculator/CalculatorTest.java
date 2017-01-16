package pk.ciit.sc.Final1.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator cal=new Calculator();

	@Test
	public void testMax() {
		int res=cal.findMax(1, 7, 6);
		assertEquals(7, res);
		
	}

	@Test
	public void testSquare() {
		int res=cal.square(6);
		assertEquals(36, res);
		
	}

}
