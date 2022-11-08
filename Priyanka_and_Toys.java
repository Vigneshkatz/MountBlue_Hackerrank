package mountBlue;

import java.util.*;
public class Priyanka_and_Toys {

	static int solve(Integer[] w) {
        Arrays.sort(w);

        int containerNum = 0;
        int limit = -1;
        for (int weight : w) {
            if (weight > limit) {
                containerNum++;
                limit = weight + 4;
            }
        }
        return containerNum;
    }
    public static int toys(List<Integer> w) {
        Integer[] arr = w.toArray(new Integer[0]);
        return solve(arr);

    }

}
