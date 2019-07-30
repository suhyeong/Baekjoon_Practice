import java.util.*;
import java.io.*;

public class prac_1978 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sosu(arr));
		
		bf.close();
	}
	
	static int sosu(int arr[]) {
		int num = 0;
		for(int i=0;i<arr.length;i++) {
			boolean isprime = true;
			if(arr[i] == 1)
				isprime = false;
			else {
				for(int j=2;j<arr[i];j++) {
					if(arr[i] % j == 0) {
						isprime = false;
						break;
					}
				}
			}
			if(isprime)
				num++;
		}
		
		return num;
	}
}
