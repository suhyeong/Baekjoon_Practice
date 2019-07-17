import java.util.*;
import java.io.*;

public class prac_2133 {
	static int d[] = new int[1001];
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		System.out.println(dp(n));
		bf.close();
	}
	
	static int dp(int x) {
		if(x == 0) return 1;
		if(x == 1) return 0;
		if(x == 2) return 3;
		if(d[x] != 0)
			return d[x];
		int result = 3 * dp(x-2);
		for(int i=3; i<=x;i++) {
			//짝수인 경우에 한해서만
			if(i%2 == 0)
				result += 2 * dp(x-i);
		}
		
		return d[x] = result;
	}
}
