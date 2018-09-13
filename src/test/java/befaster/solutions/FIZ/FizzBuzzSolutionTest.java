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
	}
	
	@Test
	public void testBuzz() {
		assertEquals("buzz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(25)));
	}
	
	@Test
	public void testFizzBuzz() {
		assertEquals("fizz buzz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(15)));
	}

	@Test
	public void testFizzBuzzNone() {
		assertEquals("98", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(98)));
	}

}
