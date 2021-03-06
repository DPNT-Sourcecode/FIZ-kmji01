/**
 * 
 */
package befaster.solutions.FIZ;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author chrisfaulkner
 *
 */
public class FizzBuzzSolutionTest {

	@Test
	public void testFizz() {
//		assertEquals("fizz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(189)));
//		assertEquals("fizz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(27)));
//		assertEquals("fizz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(129)));
//		assertEquals("fizz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(63)));
		
		assertEquals("fizz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(666)));
	}
	
	@Test
	public void testFizzDeluxe() {
		assertEquals("fizz fake deluxe", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(33)));
		// Not odd
		assertEquals("deluxe", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(444)));
	}
	
	@Test
	public void testBuzz() {
		assertEquals("buzz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(25)));
		assertEquals("buzz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(10)));
	}
	
	@Test
	public void testBuzzDeluxe() {
		assertEquals("buzz fake deluxe", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(55)));
	}
	
	@Test
	public void testFizzBuzz() {
		// 135 is div by 3 and 5
		assertEquals("fizz buzz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(135)));
		// 35 has a 3 in it but not div by 3
		assertEquals("fizz buzz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(35)));
	}

	@Test
	public void testDeluxe() {
		assertEquals("fake deluxe", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(77)));
		assertEquals("deluxe", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(2222)));
	}
	
	@Test
	public void testFizzBuzzNone() {
		assertEquals("197", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(197)));
	}

}
