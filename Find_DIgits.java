package mountBlue;

public class Find_DIgits {

	public static int findDigits(int n) {
        int count = 0;
        int div=n;
        while(div>0)
        {
            int rem=div%10;
            if(rem==0) {
            	div=div/10;
            	continue;
            }
            if(n%rem==0)
            {
                count++;
            }
            div/=10;
        }
        return count;

    }

	public static void main(String[] args) {
		System.out.println(findDigits(1012));

	}

}
