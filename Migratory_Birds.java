package mountBlue;

import java.util.List;

public class Migratory_Birds {

	public static int migratoryBirds(List<Integer> arr) {
        int[] s = new int[arr.size()];
        
        for(int i:arr)
        {
            s[i]++;
        }
        int max = Integer.MIN_VALUE;
        int index =-1;
        for( int i = 0;i<s.length;i++)
        {
            if(s[i]>max)
            {
                max=s[i];
                index = i;
            }
        }
        return index;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
