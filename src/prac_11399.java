import java.util.*;
import java.io.*;

public class prac_11399 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int[] y = new int[x];
		for(int i=0;i<y.length;i++) {
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(y);
		int sum = 0;
		for(int i=0;i<y.length;i++) {
			sum += y[i] * (x-i);
		}
		
		System.out.println(sum);
		bf.close();
	}
}
