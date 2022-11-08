package mountBlue;

public class Drawing_Book {

	public static int pageCount(int n, int p) {
	    
        int ans=0;
        
        if (n-p >= p-0) {
            ans = (p/2);
        } else if (n-1 == p && p%2 != 0) {
            ans = 1;
        } else {
            ans = (n-p) / 2;
        }
        return ans;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
