import java.util.*;
import java.io.*;

public class prac_10952 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		while(a != 0 && b != 0) {
			System.out.println(a+b);
			st = new StringTokenizer(bf.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
		}
		
		bf.close();
	}
}
