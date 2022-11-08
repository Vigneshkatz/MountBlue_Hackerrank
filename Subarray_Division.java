package trie_huffman;
import java.util.*;
public class Subarray_Division {

	public static int birthday(List<Integer> s, int d, int m) {
        int count=0;
        for(int i = 0;i<s.size()-m+1;i++)
        {
            int sum=0;
            for(int j=i;j<i+m;j++)
            {
                sum+=s.get(j);
            }
            if(sum==d)
                count++;
        }
        return count;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
