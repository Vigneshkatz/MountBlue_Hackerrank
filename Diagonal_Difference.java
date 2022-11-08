package mountBlue;

import java.util.List;

public class Diagonal_Difference {

	public static int diagonalDifference(List<List<Integer>> arr) 
    {
        int i = arr.size();
        int j = arr.get(0).size()-1;
        int k =0;
        int right=0;
        int left=0;
        for(List<Integer> li:arr)
        {
            System.out.print(li);
            
            int tempRight =li.get(k);
            System.out.print(tempRight);
            right+=tempRight;
            int tempLeft = li.get(j-k);
            System.out.print(tempLeft);
            left+=tempLeft;
            k++;  
        }
        if((right-left)<0)
            return -1*(right-left);
        return right-left;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
