package mountBlue;
import java.util.*;
public class PickingNumbers {

	public static int pickingNumbers(List<Integer> a) {
        int count =0;
        int[] arr =new int[100];
        
        for(int i =0;i<a.size();i++)
        {
           arr[a.get(i)]+=1;
        }
        for (int i = 0; i < 99; i++) {
            count = Math.max(count, arr[i]+arr[i+1]);
        }
        return count;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
