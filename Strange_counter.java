package mountBlue;

public class Strange_counter {

	 public static long strangeCounter(long t) {
	        long limit = 3;
	        while (t > limit) {
	            t -= limit;
	            limit *= 2;
	        }
	        return limit + 1 - t;

	    }
}
