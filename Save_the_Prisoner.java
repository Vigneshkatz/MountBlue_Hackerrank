package mountBlue;

public class Save_the_Prisoner {

	public static int saveThePrisoner(int n, int m, int s) {
        int pri = (m + s - 1) % n;
            if(pri == 0)
                pri = n;
            return pri;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
