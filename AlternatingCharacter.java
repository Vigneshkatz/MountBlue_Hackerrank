package mountBlue;

public class AlternatingCharacter {

	public static int alternatingCharacters(String s) {
	    
        int count =1;
        for(int  i=1;i<s.length();i++)
        {
            if(s.charAt(i-1)!=s.charAt(i))
                count++;
        }
        return s.length()-count;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
