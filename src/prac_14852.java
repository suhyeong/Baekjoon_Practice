import java.util.*;
import java.io.*;

public class prac_14852 {
	//2차원 dp를 사용해야한다.
	static long d[][] = new long[1000001][2];
	
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		System.out.println(dp(n));
		bf.close();
	}
	
	static long dp(int x) {
		d[0][0] = 0;
		d[1][0] = 2;
		d[2][0] = 7;
		d[2][1] = 1;
		
		//int result = dp(x-1)*2 + dp(x-2)*3;
		for(int i=3;i<=x;i++) {
			d[i][1] = (d[i-3][0] + d[i-1][1]) % 1000000007;
			d[i][0] = (3 * d[i-2][0] + d[i-1][0] *2 +2 *d[i][1]) % 1000000007;
		}
		
		return d[x][0];
	}
}
