package mountBlue;
import java.util.*;
public class Grading_Students {

	 public static List<Integer> gradingStudents(List<Integer> grades) {
	        ArrayList<Integer> out = new ArrayList<Integer>();
	        
	        for(int i: grades)
	        {
	            if(i<38)
	              out.add(i);
	            else{
	                int q = i/5;
	                int rem = i%5;
	                if(rem<3)
	                {
	                    out.add(i);
	                }else{
	                    out.add((q+1)*5);
	                }
	            }
	            
	        }
	        return out;

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
