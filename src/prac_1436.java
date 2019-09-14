import java.util.*;

public class prac_1436 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int answer = 0;
		
		while(N > 0) {
			answer++;
			String str = Integer.toString(answer);
			if(str.contains("666"))
				N--;
		}
		
		System.out.println(answer);
	}
}
