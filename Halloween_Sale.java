package mountBlue;

public class Halloween_Sale {

public static int howManyGames(int p, int d, int m, int s) {
        
        int count =0;
        while(s>=0)
        {
            if(p>=m)
            {
                s-=p;
                p-=d;
            }else{
                s-=m;
            }
            count++;
        }
        return s<0?count-1:count;
       
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
