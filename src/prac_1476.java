import java.util.*;

public class prac_1476 {
	public static void main(String args[]) {
		Scanner C = new Scanner(System.in);
		int E = C.nextInt(); //1<=E<=15
		int S = C.nextInt(); //1<=S<=28
		int M = C.nextInt(); //1<=M<=19
		
		long year = 1;
		while(true) {
			if((year - E) % 15 == 0 && (year - S) % 28 == 0 && (year - M) % 19 == 0) {
				break;
			}
			year++;
		}
		
		System.out.println(year);
	}
}
