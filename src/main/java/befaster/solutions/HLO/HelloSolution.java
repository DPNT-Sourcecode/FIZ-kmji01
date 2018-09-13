package befaster.solutions.HLO;

public class HelloSolution {
	
	static String HELLO_PREFIX  = "Hello";
    public String hello(String friendName) {
        return friendName != null ? HELLO_PREFIX + " " + friendName : HELLO_PREFIX;
    }
}
