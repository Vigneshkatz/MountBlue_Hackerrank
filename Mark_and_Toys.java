package mountBlue;
import java.util.*;
public class Mark_and_Toys {

	public static int maximumToys(List<Integer> list, int k) {
        Integer[] prices = list.toArray(new Integer[0]);
        Arrays.sort(prices);
        for (int i = 0, sum = 0;; sum += prices[i], i++) {
            if (sum > k) {
                return i - 1;
            } else if (i == prices.length) {
                return i;
            }
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
