package mountBlue;

public class HackerrankInString {

public static String hackerrankInString(String s) {
    
        
        String k ="hackerrank";
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (index==8) {
                break;
            }
            if (s.charAt(i)==k.charAt(index)) {
                index++;
            }
        }
        if (index==8) {
            return "YES";
        } else {
            return "NO";
        }


    }

	public static void main(String[] args) {
		System.out.println(hackerrankInString("hereiamstackerrank"));

	}

}
