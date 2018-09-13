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
		assertEquals("buzz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(645)));
	}
	
	@Test
	public void testFizzBuzz() {
		assertEquals("fizz buzz", new FizzBuzzSolution().fizzBuzz(Integer.valueOf(15)));
	}

}
