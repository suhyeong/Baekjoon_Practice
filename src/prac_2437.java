import java.util.*;
import java.io.*;

public class prac_2437 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int target = 1;
		for(int i=0;i<arr.length;i++) {
			if(target < arr[i])
				break;
			target += arr[i];
		}
		
		System.out.println(target);
		bf.close();
	}
}
