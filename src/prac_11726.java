import java.util.*;
import java.io.*;

public class prac_11726 {
	static int d[] = new int[1001];
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println(dp(n));
	}
	
	static int dp(int x) {
		if(x == 1) return 1;
		if(x == 2) return 2;
		//재귀함수가 종료되는 조건
		if(d[x] != 0)
			return d[x];
		return d[x] = (dp(x-1) + dp(x-2)) % 10007;
	}
}
