package mountBlue;

public class AppendAndDelete {

	 static boolean solve(String s, String t, int k) {
	        if (k >= s.length() + t.length()) {
	            return true;
	        }

	        for (int i = s.length();; i--) {
	            String prefixS = s.substring(0, i);
	            if (t.startsWith(prefixS)) {
	                int diff = (s.length() - i) + (t.length() - i);
	                return diff <= k && (k - diff) % 2 == 0;
	            }
	        }
	    }
	    public static String appendAndDelete(String s, String t, int k) {
	        return solve(s, t, k) ? "Yes" : "No";

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
