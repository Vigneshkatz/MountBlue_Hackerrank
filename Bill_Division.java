package trie_huffman;
import java.util.*;
public class Bill_Division {

	 public static void bonAppetit(List<Integer> bill, int k, int b) {
	       int totalToSplit = 0;
	        for (int i = 0; i < bill.size(); ++i) {
	            if (i != k) {
	                totalToSplit += bill.get(i);
	            }
	        }
	        
	        
	        if (totalToSplit / 2 >= b) {
	            System.out.println("Bon Appetit");
	        }
	        else {
	            System.out.println(b - totalToSplit / 2);
	        }

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
