package mountBlue;

public class Taum_and_Bday {

	public static long taumBday(int B, int W, int X, int Y, int Z) {
        

        long cost;
        if (X + Z < Y) {
            cost = (long) X * B + (long) (X + Z) * W;
        } else if (Y + Z < X) {
            cost = (long) (Y + Z) * B + (long) Y * W;
        } else {
            cost = (long) X * B + (long) Y * W;
        }
        return cost; 
	}
	public static void main(String[] args) {
		int n=4;
		int count=0;
		while(n>1)
		{
			if(n%2==0)
			{
				n/=2;
			}else {
				n=(n+1)/2;
			}
			count++;
			
		}
			System.out.println(count+1);
		
	}

}
