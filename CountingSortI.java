package mountBlue;
import java.util.*;
public class CountingSortI {

	 public static List<Integer> countingSort(List<Integer> arr) {

         int[] count=new int[100];
         List<Integer> list = new ArrayList<>();
         for(int i=0;i<arr.size();i++){
             count[arr.get(i)]++;
         }
        for(int i=0;i<100;i++)
        {
            
                    list.add(count[i]);
            
        }
     return list;

 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
