import java.util.*;
import java.io.*;

public class prac_10818 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		long[] arr = new long[n];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[n-1]);
		bf.close();
	}
}
