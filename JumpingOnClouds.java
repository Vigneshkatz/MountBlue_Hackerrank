package mountBlue;
import java.util.*;
public class JumpingOnClouds {

	public static int jumpingOnClouds(List<Integer> c) {
	    
        int jumps = 0;
        
        int i = 0;
        while(i < c.size()-3) //goes through all clouds up until the last jump
        {
            i += (c.get(i+2) == 0) ? 2 : 1;
            jumps++;                
        }
        
        jumps++;//This is the last jump that will be either a 1 or 2
        
        return jumps;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
