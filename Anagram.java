package mountBlue;
import java.util.*;
public class Anagram {

	static int diff(Map<Character, Integer> letter2count1, Map<Character, Integer> letter2count2) {
        int result = 0;
        for (char letterA : letter2count1.keySet()) {
            if (letter2count2.containsKey(letterA)) {
                result += Math.abs(letter2count1.get(letterA) - letter2count2.get(letterA));
            } else {
                result += letter2count1.get(letterA);
            }
        }
        for (char letterB : letter2count2.keySet()) {
            if (!letter2count1.containsKey(letterB)) {
                result += letter2count2.get(letterB);
            }
        }
        return result;
    }
    static Map<Character, Integer> buildLetter2count(String str) {
        Map<Character, Integer> letter2count = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (!letter2count.containsKey(letter)) {
                letter2count.put(letter, 0);
            }
            letter2count.put(letter, letter2count.get(letter) + 1);
        }
        return letter2count;
    }
    public static int anagram(String s) {
        if(s.length()%2==1)
            return -1;
        int halfLength = s.length() / 2;
        String s1 = s.substring(0, halfLength);
        String s2 = s.substring(halfLength);
        Map<Character, Integer> letter2count1 = buildLetter2count(s1);
        Map<Character, Integer> letter2count2 = buildLetter2count(s2);
        return (diff(letter2count1, letter2count2) / 2);
        

    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
