package trie_huffman;

public class Super_Reduced_String {

	public static String superReducedString(String s) {
	       StringBuilder out = new StringBuilder(s);
	        if(s.length()==0)
	            return s;
	       Boolean i = true;
	         while(i)
	         {
	             i = false;
	             for(int j = 0; j < out.length()-1;++j)
	             {
	                 if(out.charAt(j)==out.charAt(j+1))
	                 {
	                     out.delete(j,j+2);
	                     i=true;
	                 }
	             }
	             
	         }
	        if(out.length()==0)
	            return "Empty String";
	        return new String(out);

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
