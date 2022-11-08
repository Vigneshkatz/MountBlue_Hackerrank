package mountBlue;
import java.util.*;
public class Birthday_Cake_Candles {

	public static int birthdayCakeCandles(List<Integer> candles) {
        int max =Integer.MIN_VALUE;
        for(int i:candles)
        {
            if(i>max)
            {
                max=i;
            }
        }
        int count= 0;
        for(int i:candles)
        {
            if(i==max)
                count++;
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
