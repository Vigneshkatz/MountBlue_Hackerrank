package mountBlue;
import java.util.*;
public class Viral_Advertising {

	 public static int viralAdvertising(int n) {
		    
	        int like =0;
	        int share = 5;
	        int cu=0;
	        for(int i=0;i<n;i++)
	        {
	            like=share/2;
	            share = like*3;
	            cu+=like;
	        }
	        return cu;
	    }
	 public static void main() {
		 
	 }

}
