import java.util.*;
import java.io.*;

public class prac_1003 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int a[][] = new int[41][2];
		
		a[0][0] = 1;
		a[0][1] = 0;
		a[1][0] = 0;
		a[1][1] = 1;
		
		for(int i=2;i<41;i++) {
			for(int j=0;j<2;j++) {
				a[i][j] = a[i-1][j] + a[i-2][j];
			}
		}
		
		while(n != 0) {
			int x = Integer.parseInt(bf.readLine());
			System.out.println(a[x][0]+" "+a[x][1]);
			n--;
		}
		
		bf.close();
	}
}
