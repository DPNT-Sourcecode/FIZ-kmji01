package befaster.solutions.HLO;

public class HelloSolution {
	
	static String HELLO_PREFIX  = "Hello,";
    public String hello(String friendName) {
    	
    	final StringBuilder sb = new StringBuilder(HELLO_PREFIX);
    	if (friendName != null && !friendName.trim().isEmpty())
    	{
    		sb.append(' ').append(friendName.trim()).append("!");
    	}
    	else 
    	{
    		sb.append(" World!");
    	}
    	return sb.toString();
    }
}
