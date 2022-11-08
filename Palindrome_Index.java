package mountBlue;

public class Palindrome_Index {

	static boolean isPalindrome(String str, int beginIndex, int endIndex) {
        for (int i = beginIndex, j = endIndex; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    public static int palindromeIndex(String str) {
     for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return isPalindrome(str, i + 1, j) ? i : j;
            }
        }
        return -1;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
