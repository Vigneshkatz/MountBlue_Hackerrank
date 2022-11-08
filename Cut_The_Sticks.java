package mountBlue;
import java.util.*;
public class Cut_The_Sticks {

	public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer>out = new ArrayList<>();
        Integer[] temp = arr.toArray(new Integer[0]);
        Arrays.sort(temp);
        int n = temp.length;
        int  left=n;
        int curr=Integer.MAX_VALUE;
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            if(curr == temp[i])
            {
                count++;
            }
            else
            {
                left -= count;
                count = 1;
                curr = temp[i];
                out.add(left);
            }
        }
        return out;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
