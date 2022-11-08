package mountBlue;

public class Repeated_String {
	public static long repeatedString(String s, long n) {
		long rep = n/s.length();
	    long rem = n%s.length();
	    long count = 0;
	    for(int a = 0; a < s.length(); a++){
	        if(s.charAt(a) == 'a'){
	            count++;
	        }
	    }
	    count*= rep;
	    for(int a = 0; a < rem; a++){
	         if(s.charAt(a) == 'a'){
	            count++;
	        }
	    }
	    return count;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
