package mountBlue;
import java.util.*;
public class Lisa_Workbook {

	public static int workbook(int n, int k, List<Integer> arr) {
        Integer[] t =arr.toArray(new Integer[0]);
        int special = 0;
        int page = 1;
        int index = 0;
        for (int num : t) {
            for (int i = 1; i <= num; i++) {
                if (i == page) {
                    special++;
                }
                index++;
                if (index == k) {
                    page++;
                    index = 0;
                }
            }
            if (index != 0) {
                page++;
                index = 0;
            }
        }
        return special;   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
