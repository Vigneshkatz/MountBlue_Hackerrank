package trie_huffman;
import java.util.*;
public class Plus_Minus {

	public static void plusMinus(List<Integer> arr) {
        double po=0;
        double ne=0;
        double z=0;
        int n =arr.size();
        for(int i:arr)
        {
            if(i<0)
                ne++;
            else if(i>0)
                po++;
            else{
                z++;
            }
        }
        System.out.println(po/n);
        System.out.println(ne/n);
        System.out.println(z/n);

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
