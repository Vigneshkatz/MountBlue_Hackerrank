package mountBlue;

public class Electronics_Shop {

	static int getMoneySpent(int[] k, int[] d, int b) {
	       int max = Integer.MIN_VALUE;
	        for(int i = 0 ;i<k.length;i++)
	        {
	            for(int j = 0;j<d.length;j++)
	            {
	                int item = k[i]+d[j];
	                if(item<=b)
	                {
	                    if(item>max)
	                    {
	                        max=item;
	                    }
	                }
	            }
	        }if(max<0)
	            return -1;
	        return max;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
