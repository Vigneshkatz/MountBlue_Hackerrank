package mountBlue;

import java.util.Arrays;

public class MRU {

	public static int[] altTab(int input1,int input2,int[] input3)
	{
		 	int[] out = new int[input1];
	        int size = input1;
	        // 8,6,7,9,0,2,1,12,89
	        int d = 3;
	 
	        int appIndex = input2 % size;
	        int appId = input3[appIndex];
	 
	        for (int i = appIndex; i > 0; i--) {
	            input3[i] = input3[i - 1];
	        }
	        input3[0] = appId;
	        for(int i=0;i<input1;i++)
	        {
	        	out[i]=input3[i];
	        }
	        return out;
	}
	public static int marathon(int input1,int input2,int [] input3)
	{
		Arrays.sort(input3);
		int sum=0;
		for(int i=input1-1;i>=input1-input2;i--)
		{
			sum+=input3[i];
		}
		return sum;
	}
	public static void main(String[] args)
    {
        int[] num = { 4,3,1,6};
        
        System.out.println(marathon(4,3,num));
         
    }

}
