import java.util.*;
import java.io.*;

public class prac_2748 {
	static long arr[];
	
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		arr = new long[n+1];
		System.out.println(dp(n));
		bf.close();
	}
	
	static long dp(int x) {
		if(x == 0)
			return 0;
		if(x == 1)
			return 1;
		if(arr[x] != 0)
			return arr[x];
		return arr[x] = dp(x-1) + dp(x-2);
	}
}
