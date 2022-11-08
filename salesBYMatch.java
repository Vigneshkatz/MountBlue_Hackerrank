package mountBlue;
import java.util.*;
public class salesBYMatch {
/*There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example

n=7;
ar=[1,2,1,2,3,2];
There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .*/
	 public static int sockMerchant(int n, List<Integer> ar) {
	       Integer[] set = ar.toArray(new Integer[0]);
	        Arrays.sort(set);
	        int count=0;
	        int i=1;
	        while(i<n){
	            if(set[i]==set[i-1])
	            {
	                set[i]=-1;
	                set[i-1]=-1;
	                count++;
	                
	            }
	            i++;
	        }
	        return count;
	        }
	       
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
