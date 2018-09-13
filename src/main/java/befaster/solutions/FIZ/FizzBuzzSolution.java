package befaster.solutions.FIZ;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FizzBuzzSolution {

	static final String FIZZ = "fizz ";
	static final String BUZZ = "buzz ";
	static final String FAKE = "fake ";
	static final String DELUXE = "deluxe";
	
    public String fizzBuzz(final Integer number) {
    	final int value = number.intValue();
    	final String str = String.valueOf(value);
    	
    	final StringBuilder sb = new StringBuilder(16);
    	
    	boolean deluxe = isDeluxe(str);
    	boolean isFizz = value%3 == 0 || str.contains("3");
    	boolean isBuzz = value%5 == 0 || str.contains("5");
    	if (value > 10 && deluxe)
    	{
        	isFizz = value%3 == 0 && str.contains("3");
        	isBuzz = value%5 == 0 && str.contains("5");
    	}
    	
    	if (isFizz || isBuzz)
    	{
    		if (isFizz){
    			sb.append(FIZZ);
    		}
    		if (isBuzz) {
    			sb.append(BUZZ);
    		}
    	}
    	if (value > 10 && deluxe)
    	{
    		// Can only have fake on deluxe
    		if (value%2 != 0)
    		{
    			sb.append(FAKE);
    		}
    		if (isDeluxe(str)) {
    			sb.append(DELUXE);
    		}
    	}

    	return sb.length() >= 4 ? sb.toString().trim() : str;
    }

	private boolean isDeluxe(String str) {	
		return Arrays.stream(str.split("")).distinct().collect(Collectors.toList()).size() <= 1;

	}

}
