import java.util.*;

public class prac_2884 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int M = s.nextInt();
		if(M < 45) {
			H--;
			M += 60 - 45;
			if(H < 0)
				H = 23;
		} else {
			M -= 45;
		}
		
		System.out.println(H+" "+M);
	}
}
