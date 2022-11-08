package mountBlue;

public class Sherlock_and_Squares {
	public static int squares(int a, int b) {
	    
        int count=0;
        int sq=(int) Math.sqrt(a);
        int in=sq*sq;
        if(in<a)
            {
            sq++;
            in=sq*sq;
        }
     while(in>=a && in<=b)
        {
        count++;
         sq++;
         in=sq*sq;
        }
    return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
