package mountBlue;
import java.util.*;
public class Simple_Array_Sum {
/*Given an array of integers, find the sum of its elements.

For example, if the array[1,2,3] ,1+2+3 , so return 6 .*/
	public static int simpleArraySum(List<Integer> ar) {
	    
        int sum = 0;
        for(int i:ar)
        {
            sum+=i;
        }
        return sum;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
