import java.util.*;
import java.io.*;

public class prac_2581 {
	
	static int N;
	static int M;
	static int[] arr;
	static int sum = 0;
	static ArrayList<Integer> result = new ArrayList<Integer>();
	
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine());
		M = Integer.parseInt(bf.readLine());
		arr = new int[M+1];
		primenumber();
		bf.close();
	}
	
	static void primenumber() {
		for(int i=1;i<=M;i++) {
			arr[i] = i;
		}
		
		for(int i=2;i<=M;i++) {
			if(arr[i] == 0)
				continue;
			for(int j=i+i;j<=M;j+=i) {
				arr[j] = 0;
			}
		}
		
		for(int i=N;i<=M;i++) {
			if(arr[i] != 0 && arr[i] != 1) {
				result.add(arr[i]);
				sum += arr[i];
			}
		}
		
		if(result.size() == 0)
			System.out.println("-1");
		else {
			System.out.println(sum);
			System.out.println(result.get(0));
		}
	}
}
