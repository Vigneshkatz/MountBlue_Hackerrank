package mountBlue;

public class Jumping_on_the_Clouds_Revisited {

	static int jumpingOnClouds(int[] arr, int k) {

        int e = 100;
        int i=0;
        do{
            if((arr[i])==1)
            {
                e-=3;
            }else{
                e-=1;
            }
            System.out.print("E"+e+"->");
            i+=k;
            System.out.print("step"+i+" ");
            i%=arr.length;
        }
        while(i!=0);
        return e;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
