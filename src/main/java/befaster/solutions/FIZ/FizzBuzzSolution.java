package befaster.solutions.FIZ;

public class FizzBuzzSolution {

	static final String FIZZ = "fizz";
	static final String BUZZ = "buzz";
	
    public String fizzBuzz(final Integer number) {
    	final int value = number.intValue();
    	final boolean isDivThree = value%3 == 0;
    	final boolean isDivFive = value%5 == 0;
    	
    	if (isDivThree || isDivFive)
    	{
    		final StringBuilder sb = new StringBuilder(9);
    		if (isDivThree){
    			sb.append(FIZZ);
    			sb.append(' ');
    		}
    		if (isDivFive) {
    			sb.append(BUZZ);
    			sb.append(' ');
    		}
    		return sb.toString().trim();
    	}
    	return String.valueOf(value);
    }

}
