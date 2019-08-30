import java.util.*;
import java.io.*;

public class prac_2812 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		String str = bf.readLine();
		int[] arr = new int[n];
		for(int i=0;i<str.length();i++) {
			arr[i] = str.charAt(i) - '0';
		}
		
		int m = 0;
		int j = k;
		Stack<Integer> stack = new Stack<>();
		while(m != arr.length) {
			while(j != 0 && !stack.isEmpty() && stack.peek() < arr[m]) {
				stack.pop();
				j--;
			}
			stack.push(arr[m]);
			m++;
		}
		
		int[] result = new int[stack.size()];
		for(int i=result.length-1;i>=0;i--) {
			result[i] = stack.pop();
		}
		
		for(int i=0;i<n-k;i++) {
			System.out.print(result[i]);
		}
		
		bf.close();
	}
}
