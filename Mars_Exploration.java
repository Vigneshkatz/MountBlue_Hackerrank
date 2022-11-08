package mountBlue;

public class Mars_Exploration {

	public static int marsExploration(String s) {
	    
	       if(s.length()<3)
	           return 0;
	        int count = 0;
	        int alter =0;
	        for(int i =0; i <s.length();i++)
	        {
	            int rem = i%3;
	            char ch = s.charAt(i);
	            if(rem ==0 && ch!='S')
	            {
	                    alter++;
	            }else if (rem ==1 && ch!='O')
	            {
	                alter++;
	            }else if(rem == 2 && ch !='S')
	            {
	                alter++;
	            }else{
	                continue;
	            }
	        }
	        return alter;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
