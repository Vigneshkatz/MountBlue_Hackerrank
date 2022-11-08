package mountBlue;
import java.util.*;
public class Designer_Pdf_Viewer {

	public static int designerPdfViewer(List<Integer> h, String word) {
        int max =0;
        for(int i =0;i<word.length();i++)
        {
            int temp = h.get(word.charAt(i)-97);
            if(temp>max)
                max =temp;
        }
        return max*word.length();
    }
	public static void main(String[] args) {
		
	}

}
