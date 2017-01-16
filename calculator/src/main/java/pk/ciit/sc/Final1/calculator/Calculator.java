package pk.ciit.sc.Final1.calculator;

/**
 * @author UMAR Fa13-Bse-159
 *
 */
public class Calculator {
	/**
	 * @param firstnumber
	 * @param second number
	 * @param third number
	 * @return  maximum number from given numbers
	 */
	
	public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	/**
	 * @param this method recive number to perform calculations for sequare
	 * @return calculte square
	 * @throws IllegalArgumentException
	 */
	public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
			result = num * num;
		} else
			throw new IllegalArgumentException();
		return result;
	}
	/**
	 * @param this method recive number to perform calculations for cube
	 * @return calcuate the cube
	 */
	public int Cube(int num){
		return num*num*num;
	}
}