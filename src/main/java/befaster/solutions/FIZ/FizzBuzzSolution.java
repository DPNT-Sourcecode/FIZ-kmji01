package befaster.solutions.FIZ;

import java.util.Arrays;

public class FizzBuzzSolution {

	static final String FIZZ = "fizz";
	static final String BUZZ = "buzz";
	
    public String fizzBuzz(final Integer number) {
    	final int value = number.intValue();
    	final String str = String.valueOf(value);
    	
    	final boolean isFizz = value%3 == 0 || str.contains("3");
    	final boolean isBuzz = value%5 == 0 || str.contains("5");
    	
    	final StringBuilder sb = new StringBuilder(16);
    	if (isFizz || isBuzz)
    	{
    		
    		if (isFizz){
    			sb.append(FIZZ);
    			sb.append(' ');
    		}
    		if (isBuzz) {
    			sb.append(BUZZ);
    			sb.append(' ');
    		}
    	}
    	
    	if (value > 10)
    	{
    		if (isDeluxe(str)) {
    			
    		}
    			
    	}
    	
    	return str;
    }

}
