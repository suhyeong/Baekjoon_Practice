import java.util.*;
import java.io.*;

public class prac_11047 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int[] m = new int[x];
		for(int i=0;i<m.length;i++) {
			m[i] = Integer.parseInt(bf.readLine());
		}
		
		int count = 0;
		for(int i=m.length-1;i>=0;i--) {
			count += y / m[i];
			y = y % m[i];
		}
		
		System.out.println(count);
		bf.close();
	}
}
