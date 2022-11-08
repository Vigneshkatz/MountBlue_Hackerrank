package trie_huffman;
import java.util.*;
public class Compare_the_Triplets {

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int bob=0;
        int alice = 0;
        for(int i = 0 ;i <a.size();i++)
        {
            if(a.get(i)>b.get(i))
            {
                alice++;
            }else if(a.get(i)<b.get(i))
                bob++;
        }
        List<Integer> list = new ArrayList<Integer>();
        list.add(alice);
        list.add(bob);
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
