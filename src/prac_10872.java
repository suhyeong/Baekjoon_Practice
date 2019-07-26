import java.util.*;
import java.io.*;

public class prac_10872 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		bw.write(factorial(n)+"");
		bw.close();
		bf.close();
	}
	
	static int factorial(int x) {
		if(x == 0 || x == 1)
			return 1;
		return x*factorial(x-1);
	}
}
