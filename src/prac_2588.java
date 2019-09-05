import java.util.*;

public class prac_2588 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = Integer.parseInt(s.nextLine());
		String b = s.nextLine();
		int[] barr = new int[b.length()];
		for(int i=0;i<barr.length;i++) {
			barr[i] = b.charAt(i) - '0';
		}
		
		int result = 0;
		int j = 0;
		for(int i=barr.length-1;i>=0;i--) {
			int num = a * barr[i];
			System.out.println(num);
			result += num * Math.pow(10, j);
			j++;
		}
		
		System.out.println(result);
	}
}
