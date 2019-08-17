import java.util.*;
import java.io.*;

public class prac_5585 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int y = Integer.parseInt(bf.readLine());
		int m = 1000 - y;
		int count = 0;
		
		count += m / 500;
		m = m % 500;
		
		count += m / 100;
		m = m % 100;
		
		count += m / 50;
		m = m % 50;
		
		count += m / 10;
		m = m % 10;
		
		count += m / 5;
		m = m % 5;
		
		count += m / 1;
		
		System.out.println(count);
		bf.close();
	}
}
