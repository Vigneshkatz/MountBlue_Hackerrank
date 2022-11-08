package mountBlue;
import java.util.*;
public class Intro_To_Challenge {

	public static int introTutorial(int V, List<Integer> arr) {
        Integer[] numbers = arr.toArray(new Integer[0]);
        for (int i = 0;; i++) {
            if (numbers[i] == V) {
                 return i;
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
