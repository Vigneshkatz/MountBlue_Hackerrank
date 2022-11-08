package mountBlue;

public class CamelCase {

	public static int camelcase(String s) {
        if(s.length()==0)
            return 0;
        int words = 1;
        for(int i = 0 ;i <s.length() ;i++)
        {
            char ch =s.charAt(i);
            if(ch<='Z')
            {
                words++;
            }
        }
        return words;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
