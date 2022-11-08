package mountBlue;
import java.util.*;
public class Beautiful_Triplet {
	public static int beautifulTriplets(int d, List<Integer> arr) {
	    
        int count=0;
        
        for(Integer digit : arr)
        {
            if(arr.contains(digit+d) && arr.contains(digit+(2*d)))
            {
                count++;
            }
        }
        return count;

    }
	public static void main(String[] args) {
		String s = "Hackerrank";
		String str ="hacker";
		System.out.println("Index"+s.indexOf(str.charAt(1)));
	}
}
