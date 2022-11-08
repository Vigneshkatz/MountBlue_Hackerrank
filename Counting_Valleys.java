package mountBlue;

public class Counting_Valleys {

	public static int countingValleys(int steps, String path) {
	    
        int out =0 ;
        int count =0 ;
        for(int  i = 0;i<path.length();i++)
        {
            char ch = path.charAt(i);
            if(ch=='U')
            {
                if(out == -1)
                    count++;
                out++;
            }else{
                out--;
            }
        }
        return count;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
