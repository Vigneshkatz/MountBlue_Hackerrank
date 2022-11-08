package mountBlue;


public class Utopian_tree {
	public static int utopianTree(int n) {
	    
	    int height=0;
	    for(int i = 0;i<=n;i++)
	    {
	        if(i % 2 == 0)
	        {
	            height=(int) ((Math.pow(2, i/2)*2) -1);
	        }
	        else
	        {
	            height=(int) (((Math.pow(2, (i-1)/2)*2) -1)*2);
	        }
	    }
	    return height;
	}

}
