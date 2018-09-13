package befaster.solutions.HLO;

public class HelloSolution {
	
	static String HELLO_PREFIX  = "Hello";
    public String hello(String friendName) {
        return friendName != null && !friendName.trim().isEmpty() ? HELLO_PREFIX + " " + friendName.trim() : HELLO_PREFIX;
    }
}
