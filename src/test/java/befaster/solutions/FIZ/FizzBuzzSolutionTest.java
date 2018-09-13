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
		assertEquals("fizz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(189)));
		assertEquals("fizz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(198)));
		assertEquals("fizz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(13)));
	}
	
	@Test
	public void testFizzDeluxe() {
		assertEquals("fizz deluxe", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(33)));
	}
	
	@Test
	public void testBuzz() {
		assertEquals("buzz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(25)));
		assertEquals("buzz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(10)));
	}
	
	@Test
	public void testBuzzDeluxe() {
		assertEquals("buzz deluxe", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(55)));
	}
	
	@Test
	public void testFizzBuzz() {
		assertEquals("fizz buzz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(15)));
		assertEquals("fizz buzz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(35)));
	}

	@Test
	public void testDeluxe() {
		assertEquals("deluxe", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(2222)));
	}
	
	@Test
	public void testFizzBuzzNone() {
		assertEquals("197", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(197)));
	}

}
