import java.io.*;
import java.util.*;

public class prac_11727 {
	static int d[] = new int[1001];
	
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		System.out.println(dp(n));
		bf.close();
	}
	
	static int dp(int x) {
		if(x == 1) return 1;
		if(x == 2) return 3;
		if(d[x] != 0)
			return d[x];
		return d[x] = (dp(x-1) + 2 * dp(x-2)) % 10007;
	}
}
