package mountBlue;

public class Chocolate_feast {

	public static int chocolateFeast(int n, int c, int m) {
	    
        int buy=n/c;
      int wrap=n/c;
     while(wrap>1){
         
          int rep =wrap/m;
          buy+=rep;
          wrap=wrap%m+rep;
         System.out.print(wrap+"<-");
         
     }
      return buy;

  }
	public static void main(String[] args) {
		System.out.println(chocolateFeast(15,3,2));

	}

}
