import java.util.*;

public class prac_10817 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if(a > b) { //a>b
			if(c > a) {
				System.out.println(a);
			}
			else { // c<a
				if(b>c)
					System.out.println(b);
				else
					System.out.println(c);
			}
		}
		else { // a<b
			if(c < a)
				System.out.println(a);
			else { //c>a
				if(b > c)
					System.out.println(c);
				else
					System.out.println(b);
			}
		}
	}
}
