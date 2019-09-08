import java.util.*;
import java.io.*;

public class prac_7568 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[][] arr = new int[N][2];
		int[] answer = new int[N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer stk = new StringTokenizer(bf.readLine());
			for(int j=0;j<2;j++) {
				arr[i][j] = Integer.parseInt(stk.nextToken());
			}
		}
		
		for(int i=0;i<N;i++) {
			int num = 0;
			for(int j=0;j<N;j++) {
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
					num++;
			}
			num++;
			answer[i] = num;
		}
		
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i]+" ");
		}
		bf.close();
	}
}
