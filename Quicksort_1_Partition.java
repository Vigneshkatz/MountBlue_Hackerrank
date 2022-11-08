package trie_huffman;
import java.util.*;
public class Quicksort_1_Partition {

	public static List<Integer> quickSort(List<Integer> arr) {
	       int pivot = arr.get(0);
	        ArrayList<Integer> left = new ArrayList<Integer>();
	        ArrayList<Integer> right = new ArrayList<Integer>();
	        int k=0;
	        for(int i:arr)
	        {
	            if(i<pivot)
	                left.add(i);
	            else{
	                right.add(i);
	            }
	        }
	        left.addAll(right);
	        return left;
	      
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
