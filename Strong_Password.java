package mountBlue;

public class Strong_Password {

	public static int minimumNumber(int n, String password) {
        
	       String num = "0123456789";
	        String lC = "abcdefghijklmnopqrstuvwxyz";
	        String uC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String sP = "!@#$%^&*()-+";

	        int out = 0;

	        boolean digits = false;
	        
	        boolean lower = false;
	        
	        boolean upper = false;
	        
	        boolean special = false;
	        for (int i = 0; i < n; i++)
	        {
	            if (num.indexOf(password.charAt(i))!=-1) digits = true;
	            if (lC.indexOf(password.charAt(i))!=-1) lower = true;
	            if (uC.indexOf(password.charAt(i))!=-1) upper = true;
	            if (sP.indexOf(password.charAt(i))!=-1) special = true;
	        }
	        if (!digits) out++;
	        if (!lower) out++;
	        if (!upper) out++;
	        if (!special) out++;

	        if (n + out < 6)
	        {
	            out += (6 - n - out);
	        }

	        return out;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
