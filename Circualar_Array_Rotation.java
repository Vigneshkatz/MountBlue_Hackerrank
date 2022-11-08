package mountBlue;
import java.util.*;
public class Circualar_Array_Rotation {

	 public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> q) {
		    
	        Integer[] arr = a.toArray(new Integer[0]);
	        int n = arr.length;
	        List<Integer> out=new ArrayList<>();
	        for (int i = 0; i < q.size(); i++) {
	            
	            out.add(arr[((q.get(i) - k) % n + n) % n]);
	        }

	    return  out;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
