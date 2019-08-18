import java.util.*;
import java.io.*;

public class prac_1969 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st1.nextToken());
		int m = Integer.parseInt(st1.nextToken());
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		
		String[] str = new String[n];
		for(int i=0;i<str.length;i++) {
			str[i] = bf.readLine();
		} //input
		
		for(int i=0;i<m;i++) {
			
			int count[] = new int[4];
			for(int j=0;j<n;j++) {
				char c = str[j].charAt(i);
				if(c == 'A') {
					count[0]++;
				} else if(c == 'C') {
					count[1]++;
				} else if(c == 'G') {
					count[2]++;
				} else if(c == 'T') {
					count[3]++;
				}
			}
			
			int index = 0;
			for(int z=1;z<count.length;z++) {
				if(count[index] < count[z])
					index = z;
			}
			int min = n - count[index];
			cnt += min;
			
			switch(index) {
			case 0:
				sb.append('A');
				break;
			case 1:
				sb.append('C');
				break;
			case 2:
				sb.append('G');
				break;
			case 3:
				sb.append('T');
				break;
			}
			
		}
		
		System.out.println(sb);
		System.out.println(cnt);
		bf.close();
	}
}
