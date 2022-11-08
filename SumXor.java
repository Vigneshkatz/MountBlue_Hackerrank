package mountBlue;

public class SumXor {

	public static long sumXor(long n) {
        long count = 0;
        
        while(n != 0){
            count += (n%2 == 0)?1:0;
            n/=2; 
        }
        count = (long) Math.pow(2,count);
       return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
