import java.util.*;
import java.io.*;

public class prac_10951 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		while((str = bf.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			if(st.hasMoreTokens()) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				System.out.println(a+b);
			}
		}
		bf.close();
	}
}
