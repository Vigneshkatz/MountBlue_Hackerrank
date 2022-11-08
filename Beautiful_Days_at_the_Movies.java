package mountBlue;

public class Beautiful_Days_at_the_Movies {

	 public static int beautifulDays(int i, int j, int k) {
	        
	        int count = 0;
	        
	        for (;i<=j;i++){
	            StringBuilder temp = new StringBuilder();
	            temp.append(i);
	            temp=temp.reverse();
	           
	            int rev = Integer.parseInt(temp.toString());
	            if(Math.abs((i-rev)%k)==0){
	                count++;
	            }
	        }
	        
	        return count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
