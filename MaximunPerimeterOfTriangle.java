package mountBlue;
import java.util.*;
public class MaximunPerimeterOfTriangle {

	public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        Integer[] peri =sticks.toArray(new Integer[0]);
        List<Integer> list = new ArrayList<>();
        Arrays.sort(peri);
        int pos = sticks.size()-3;
        while ((pos>=0) && (peri[pos] + peri[pos+1] <= peri[pos+2])) {
            pos--;
        }
        if (pos < 0) {
            list.add(-1);
        } else {
            list.add(peri[pos]);
            list.add(peri[pos + 1]);
            list.add(peri[pos + 2]);
        }
        return list;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
