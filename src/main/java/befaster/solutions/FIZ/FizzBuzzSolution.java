package befaster.solutions.FIZ;

public class FizzBuzzSolution {

	static final String FIZZ = "fizz";
	static final String BUZZ = "buzz";
	
    public String fizzBuzz(final Integer number) {
    	final int value = number.intValue();
    	final String str = String.valueOf(value);
    	final boolean isFizz = value%3 == 0 || str.contains("3");
    	final boolean isBuzz = value%5 == 0 || str.contains("5");
    	
    	if (isFizz || isBuzz)
    	{
    		final StringBuilder sb = new StringBuilder(9);
    		if (isFizz){
    			sb.append(FIZZ);
    			sb.append(' ');
    		}
    		if (isBuzz) {
    			sb.append(BUZZ);
    			sb.append(' ');
    		}
    		return sb.toString().trim();
    	}
    	return str;
    }

}
