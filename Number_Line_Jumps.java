package trie_huffman;

public class Number_Line_Jumps {

	public static String kangaroo(int x1, int v1, int x2, int v2) {
	     if (x1 == x2) {
	            return "YES";
	        }
	        int diff = v1 > v2 ? v1 - v2 : v2 - v1;
	        if (diff == 0) {
	            return "NO";
	        }
	        
	        int xdiff = x1 - x2;
	        int vdiff = v2 - v1;
	        
	        if ((xdiff < 0 && vdiff < 0) || (xdiff > 0 && vdiff > 0)) {
	            int mod = xdiff % vdiff;
	            int mod2 = vdiff % xdiff;
	            if (mod == 0 || mod2 == 0) {
	                return "YES";
	            }
	        }
	        return "NO";
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
