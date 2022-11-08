package mountBlue;
import java.util.*;
public class Closest_Number {

	 public static List<Integer> closestNumbers(List<Integer> arr) {
	        Integer[] a = arr.toArray(new Integer[0]);
	        Arrays.sort(a);
	        int minDiff = Integer.MAX_VALUE;
	        List<Integer> indices = new ArrayList<Integer>();
	        for(int i=a.length-1;i>0;i--)
	        {
	            Integer temp = a[i]-a[i-1];
	            if(minDiff>temp)    
	            
	                minDiff=temp;
	        }
	        System.out.print(minDiff);
	         for(int i=a.length-1;i>0;i--)
	         {
	             if(a[i]-a[i-1]==minDiff)
	             {
	                 indices.add(a[i-1]);
	                 indices.add(a[i]);
	             }
	         }
	        return indices;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
