import java.util.*;

public class prac_8393 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int result = 0;
		
		for(int i=1;i<=x;i++) {
			result += i;
		}
		
		System.out.println(result);
	}
}
