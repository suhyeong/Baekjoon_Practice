import java.util.*;
import java.io.*;

public class prac_2941 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String str = bf.readLine();
		
		for(int i=0;i<croatia.length;i++) {
			if(str.contains(croatia[i])) {
				str = str.replaceAll(croatia[i], "*");
			}
		}
		
		System.out.println(str.length());
		
		bf.close();
	}
}
