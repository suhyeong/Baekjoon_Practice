import java.util.*;

public class prac_2231 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str_N = s.nextLine();
		int int_N = Integer.parseInt(str_N);
		
		int answer = 0;
		for(int i=1;i<int_N;i++) {
			int sum = i;
			for(int j=0;j<String.valueOf(i).length();j++) {
				sum += String.valueOf(i).charAt(j) - '0';
			}
			if(sum == int_N) {
				answer = i;
				break;
			} else if(answer == sum && i == int_N-1) {
				answer = 0;
			}
		}
		System.out.print(answer);
	}
}
