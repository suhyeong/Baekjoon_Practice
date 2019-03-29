import java.util.*;

public class prac_10871 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		int num[] = new int[n];
		
		for(int i=0;i<n;i++) {
			num[i] = s.nextInt();
			if(num[i] < x)
				System.out.print(num[i]+" ");
		}
	}
}
