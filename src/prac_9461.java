import java.util.*;
import java.io.*;

public class prac_9461 {
	static long[] d = new long[101];
	
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		while(n != 0) {
			int x = Integer.parseInt(bf.readLine());
			System.out.println(dp(x));
			n--;
		}
		bf.close();
	}
	
	static long dp(int x) {
		if(x == 1 || x == 2 || x == 3)
			return 1;
		else if(d[x] != 0)
			return d[x];
		return d[x] = dp(x-2) + dp(x-3);
	}
}
