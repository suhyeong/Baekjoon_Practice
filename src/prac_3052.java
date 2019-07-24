import java.util.*;
import java.io.*;

public class prac_3052 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		int[] result = new int[10];
		
		for(int i=0;i<10;i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			result[i] = arr[i] % 42;
		} //input
		
		Arrays.sort(result);
		
		int count = 0;
		for(int i=0;i<10;i++) {
			if(i+1 < 10 && result[i] == result[i+1])
				continue;
			else
				count++;
		}
		System.out.println(count);
		
		bf.close();
	}
}
