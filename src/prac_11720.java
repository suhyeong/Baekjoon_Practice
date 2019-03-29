import java.util.*;

public class prac_11720 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int numcount = s.nextInt();
		String num = s.next();
		int result = 0;
		
		int numarr[] = new int[numcount];
		for(int i=0;i<numcount;i++) {
			numarr[i] = num.charAt(i);
			result += (numarr[i] - 48);
		}
		
		System.out.println(result);
	}
}
