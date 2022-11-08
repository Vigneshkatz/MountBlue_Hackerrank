package mountBlue;

public class Pangram {

	static boolean isPangram(String sentence) {
        String l = sentence.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (l.indexOf(ch) < 0) return false;
        }
        return true;
    }
    public static String pangrams(String s) {
    
       return isPangram(s)?"pangram":"not pangram";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
