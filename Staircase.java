package trie_huffman;

public class Staircase {

	public static void staircase(int n) {
	    for(int i = 1 ;i<=n ;i++)
	    {
	        for(int s = 0;s<n-i;s++)
	        {
	            System.out.print(" ");
	        }
	        for(int st = 1;st<=i ;st++)
	        {
	            System.out.print("#");
	        }
	        System.out.println();
	    }

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
