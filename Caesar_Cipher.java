package mountBlue;

public class Caesar_Cipher {

	public static String caesarCipher(String input, int k) {
        int n =input.length();
        StringBuilder builder = new StringBuilder(input.length());
        for (int i = 0; i < n; i++) {
            char temp = input.charAt(i);
            boolean upperCase = Character.isUpperCase(temp);
            if (Character.isLetter(temp)) {
                temp += k%26;
                if (!Character.isLetter(temp) || (upperCase && !Character.isUpperCase(temp))) {
                    temp -= 26;
                }
            }
            builder.append(temp);
        }
        
        return (builder.toString());

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
