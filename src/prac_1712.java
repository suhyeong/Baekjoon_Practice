import java.util.*;
import java.io.*;

public class prac_1712 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long C = Integer.parseInt(st.nextToken());
		long count = 1;
		
		while(true) {
			if(A+(B*count) < C*count)
				break;
			else if((C-B) <= 0) {
				count = -1;
				break;
			}
			count++;
		}
		
		System.out.println(count);
		bf.close();
	}
}
