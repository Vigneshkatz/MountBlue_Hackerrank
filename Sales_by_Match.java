
package trie_huffman;
import java.util.*;
public class Sales_by_Match {

	 public static int sockMerchant(int n, List<Integer> ar) {
	        int[] set = new int[ar.size()];
	        int k=0;
	        for(int i: ar)
	        {
	            set[k++]=i;
	        }
	        Arrays.sort(set);
	        int count=0;
	        int i=1;
	        while(i<n){
	            if(set[i]==set[i-1])
	            {
	                set[i]=-1;
	                set[i-1]=-1;
	                count++;
	                
	            }
	            i++;
	        }
	        return count;
	        }
	        

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
