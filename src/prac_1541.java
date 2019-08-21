import java.util.*;
import java.io.*;

public class prac_1541 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str = bf.readLine();
		String[] strminus = str.split("\\-");
		
		int sum = 0;
		for(int i=0;i<strminus.length;i++) {
			String[] strplus = strminus[i].split("\\+");
			
			int plussum = 0;
			for(int j=0;j<strplus.length;j++) {
				plussum += Integer.parseInt(strplus[j]);
			}
			
			if(i == 0) {
				plussum *= -1;
			}
			
			sum -= plussum;
		}
		
		System.out.println(sum);
		bf.close();
		
	}
}
