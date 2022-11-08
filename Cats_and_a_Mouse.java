package mountBlue;

public class Cats_and_a_Mouse {

static String catAndMouse(int tom, int cat, int jerry) {

        
        int diff1= Math.abs(jerry-tom);
        int diff2 = Math.abs(jerry-cat);
        if(diff1==diff2)
        {
            return "Mouse C";
        }
        else if(diff1<diff2)
        {
            return "Cat A";
        }else{
            return "Cat B";
        }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
