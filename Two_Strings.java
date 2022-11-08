package mountBlue;
import java.util.*;
public class Two_Strings {

	public static String twoStrings(String s1, String s2) {
	    
	       
        Set<Character> a = new HashSet<>();
            Set<Character> b = new HashSet<>();
            
            //Populate the sets
            for(int i = 0; i < s1.length(); i++)
                a.add(s1.charAt(i));
            
            for(int i = 0; i < s2.length(); i++)
                b.add(s2.charAt(i));
            
            //Perform the intersection of the two sets
            a.retainAll(b);
                
            if(a.size() > 0)
                return "YES";
            else
               return "NO";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
