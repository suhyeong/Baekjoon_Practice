import java.util.*;
import java.io.*;

public class prac_2798 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		StringTokenizer str = new StringTokenizer(bf.readLine());
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(str.nextToken());
		} //input
		
		int sum = 0;
		int answer = 0;
		for(int i=0;i<N;i++) {
			sum += arr[i];
			for(int j=i+1;j<N;j++) {
				sum += arr[j];
				for(int k=j+1;k<N;k++) {
					sum += arr[k];
					if((M >= sum) && (sum > answer)) {
						answer = sum;
					}
					sum -= arr[k];
				}
				sum -= arr[j];
			}
			sum = 0;
		}
		
		System.out.println(answer);
		bf.close();
	}
}
