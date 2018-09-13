package befaster.solutions.HLO;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloSolutionTest {
	
	private HelloSolution helloSolution;

	@Before
	public void setUp() {
		helloSolution = new HelloSolution();
	}
	
	
	@Test
	public void testHello() {
		assertEquals("Hello Dave", helloSolution.hello("Dave"));
	}
	
	@Test
	public void testHelloNull() {
		assertEquals("Hello", helloSolution.hello(null));
		assertEquals("Hello", helloSolution.hello(""));
	}

}
