import java.util.*;
import java.io.*;

public class prac_2217 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		Arrays.sort(arr);
		int max = 0;
		for(int i=n-1;i>=0;i--) {
			if(max < arr[i] * (n-i))
				max = arr[i] * (n-i);
		}
		
		System.out.println(max);
		bf.close();
	}
}
