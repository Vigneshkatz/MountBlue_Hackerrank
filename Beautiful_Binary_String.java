package mountBlue;

public class Beautiful_Binary_String {

	 public static int beautifulBinaryString(String s) {
	        int count=0;
	        for(int i = 0; i < s.length()-2; i++)
	        {
	            if(s.charAt(i) == '0' && s.charAt(i+1) == '1' && s.charAt(i+2) == '0')
	            {
	                count++;
	                i += 2;
	            }
	        }
	       return count;

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
