package pk.ciit.sc.Final1.calculator;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	ICal cal=new Calculator();

	@Test
	public void testMax() {
		int res=cal.findMax(1, 7, 6);
		System.out.println("Test Case to   Find Max");
		assertEquals(7, res);
		
	}
	
	@Ignore
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
	

	public void testSquareSkipped(){
		int res=cal.square(-3);
		assertEquals(0, res);
		System.out.println("Test Case  Square");
	}
	
	
	@Test (expected = IllegalArgumentException .class)
	public void testDevideException() throws IllegalArgumentException {
		cal.square(15);
		System.out.println("Test Case IllegalArgumentException ");
		
	}

}
