package mountBlue;

import java.util.Arrays;
import java.util.List;

public class Marcs_Cakewalk {

	public static long marcsCakewalk(List<Integer> c) {
	    
        int[] arr = new int[c.size()];
        int j=0;
        for(int i: c)
        {
            arr[j++]=i;
        }
        Arrays.sort(arr);
        int n=arr.length-1;
        long miles=0;
        for(int i=n,k=0;i>=0;i--,k++)
        {
            miles+=Math.pow(2,i)*(arr[k]);
        }
        return miles;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
