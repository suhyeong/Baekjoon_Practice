import java.util.*;
import java.io.*;

public class prac_1929 {
	static int[] arr;
	
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		arr = new int[b+1];
		PrimeNumberSieve(a, b);
		bf.close();
	}
	
	static void PrimeNumberSieve(int a, int b) {
		for(int i=2;i<=b;i++) {
			arr[i] = i;
		}
		
		for(int i=2;i<=b;i++) {
			if(arr[i] == 0)
				continue;
			for(int j=i+i;j<=b;j+=i) {
				arr[j] = 0; 
			}
		}
		
		for(int i=a;i<=b;i++) {
			if(arr[i] != 0)
				System.out.println(arr[i]);
		}
	}
}
