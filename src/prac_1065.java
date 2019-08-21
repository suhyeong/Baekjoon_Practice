import java.util.*;
import java.io.*;
import java.lang.*;

public class prac_1065 {
	
	static int count = 0;
	
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(bf.readLine());
		System.out.println(hansu(x));
		bf.close();
	}
	
	static int hansu(int x) {
		boolean isHansu = true;
		
		for(int i=1;i<=x;i++) {
			int isize = (int)(Math.log10(i)+1); //x의 사이즈
			int y = i;
			int[] iarr = new int[isize];
			int[] subarr = new int[isize-1];
			
			for(int j=0;j<isize;j++) {
				iarr[j] = (int)(y / Math.pow(10, isize-1-j));
				y = (int)(y % Math.pow(10, isize-1-j));
			}
			
			for(int j=0;j<subarr.length;j++) {
				subarr[j] = iarr[j+1] - iarr[j];
			}
			
			for(int j=0;j<subarr.length-1;j++) {
				if(subarr.length == 0 || subarr.length == 1) {
					isHansu = true;
					break;
				} else {
					if(subarr[j] == subarr[j+1]) {
						isHansu = true;
						continue;
					} else {
						isHansu = false;
						break;
					}
				}
			}
			
			if(isHansu)
				count++;
		}
		
		return count;
	}
}
