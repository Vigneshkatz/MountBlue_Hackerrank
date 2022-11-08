package mountBlue;
import java.util.*;
public class Running_Time_of_Algorithms {
	
	public static int insertionSort(Integer[] A) 
	{
        int shiftNum = 0;
        for (int i = 1; i < A.length; i++) 
        {
            int value = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > value) {
                A[j + 1] = A[j];
                j = j - 1;
                shiftNum++;
            }
            A[j + 1] = value;
        }
        return shiftNum;
    } 
	public static int runningTime(List<Integer> arr) 
	{
        
        Integer[] ar = arr.toArray(new Integer[0]); 
        return insertionSort(ar);
    }
	public static void main(String[] args) 
	{
	}
}
