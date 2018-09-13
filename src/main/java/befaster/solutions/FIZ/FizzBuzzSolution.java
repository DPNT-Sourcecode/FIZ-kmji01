package befaster.solutions.FIZ;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FizzBuzzSolution {

	static final String FIZZ = "fizz ";
	static final String BUZZ = "buzz ";
	static final String DELUXE = "deluxe";
	
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
    		}
    		if (isBuzz) {
    			sb.append(BUZZ);
    		}
    	}
    	
    	if (value > 10)
    	{
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
