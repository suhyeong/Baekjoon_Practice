import java.util.*;
import java.io.*;

public class prac_1018 {
	static String[] chesspan;
	static String[] Wresult = { "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW"};
	static String[] Bresult = { "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB", "BWBWBWBW", "WBWBWBWB"};
	
	public static void main(String args[]) throws IOException {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		String ts = s.nextLine();
		chesspan = new String[N];
		for(int i=0;i<N;i++) {
			chesspan[i] = s.nextLine();
		}
		
		int result = 999999;
		for(int i=0;i+7<N;i++) {
			for(int j=0;j+7<M;j++) {
				result = min(result, checkW(chesspan, i, j), checkB(chesspan, i, j));
			}
		}
		
		System.out.println(result);
	}
	
	static int checkW(String[] chesspan, int x, int y) {
		int result = 0;
		for(int a=x;a<x+8;a++) {
			for(int b=y;b<y+8;b++) {
				if(chesspan[a].charAt(b) == Bresult[a-x].charAt(b-y))
					result++;
			}
		}
		
		return result;
	}
	
	static int checkB(String[] chesspan, int x, int y) {
		int result = 0;
		for(int a=x;a<x+8;a++) {
			for(int b=y;b<y+8;b++) {
				if(chesspan[a].charAt(b) == Wresult[a-x].charAt(b-y))
					result++;
			}
		}
		
		return result;
	}
	
	static int min(int a, int b, int c) {
		return (a < b ? (a < c ? a : c) : (b < c ? b : c));
	}
}
