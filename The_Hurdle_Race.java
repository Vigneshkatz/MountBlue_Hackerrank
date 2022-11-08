package mountBlue;

import java.util.List;

public class The_Hurdle_Race {

	  public static int hurdleRace(int k, List<Integer> height) {
	        int max = Integer.MIN_VALUE;
	        for(int i:height)
	        {
	            if(i>max)
	            {
	                max=i;
	            }
	        }
	        int diff =max-k;
	        if(diff>0)
	            return diff;
	        return 0;

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
