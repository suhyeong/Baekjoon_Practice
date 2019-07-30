import java.util.*;
import java.io.*;

public class prac_11650 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[][] arr_ = null;
		arr_ = new int[n][2];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j=0;j<2;j++) {
				arr_[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(arr_, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[0] - o2[0] > 0)
					return 1;
				else if(o1[0] - o2[0] == 0) {
					if(o1[1] - o2[1] > 0)
						return 1;
					else if(o1[1] - o2[1] == 0)
						return 0;
					else
						return -1;
				}
				else
					return -1;
			}
		});
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr_[i][j]+" ");
			}
			System.out.println();
		}
		
		bf.close();
	}
}
