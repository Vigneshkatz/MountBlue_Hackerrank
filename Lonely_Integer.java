package mountBlue;
import java.util.*;
public class Lonely_Integer {

	public static int lonelyinteger(List<Integer> arr) {
	    // Write your code here
	        int[] count = new int[101];
	        Integer[] a =arr.toArray(new Integer[0]);
	        for (int i = 0; i < a.length; i++) {
	            if(a[i]>=0 && a[i]<=100)
	                count[a[i]]++;
	            
	        }
	        for (int i = 0; i < count.length; i++) {
	            
	            if(count[i]%2==1)
	                return i;
	        }
	   
	        return 0;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 
}
