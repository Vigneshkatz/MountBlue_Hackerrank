package mountBlue;
import java.util.*;
public class Sequence_Equation {

	public static List<Integer> permutationEquation(List<Integer> p) {
	    
        Integer[] arr = p.toArray(new Integer[0]);
        List<Integer> out = new ArrayList<Integer> ();
        for(int i = 1;i<=arr.length;i++)
        {
            for(int j = 0;j<arr.length;j++)
            {
                if(arr[j]==i)
                {
                   
                    for(int k = 0;k<arr.length;k++)
                    {
                       if(j+1==arr[k])
                           out.add(k+1);
                    }
                }
            }
        }
        return out;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
