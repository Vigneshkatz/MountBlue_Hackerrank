package mountBlue;

import java.util.List;

public class Angry_Professor {

	 public static String angryProfessor(int k, List<Integer> a) {
		    
	        int onTime = 0;
	        for(int i:a)
	        {
	            if(i<=0)
	            {
	                onTime++;
	            }
	        }
	        if(onTime>=k)
	        {
	            return "NO";
	        }else{
	            return "YES";
	        }

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
