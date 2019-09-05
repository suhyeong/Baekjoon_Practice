import java.util.*;

public class prac_2753 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		if((x % 4 == 0) && (x % 100 != 0) || (x % 400 == 0))
			System.out.println("1");
		else
			System.out.println("0");
	}
}
