import java.util.*;
import java.io.*;

public class prac_2562 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		for(int i=0;i<9;i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		int max = 0;
		int index = 0;
		for(int i=0;i<9;i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index+1);
		bf.close();
	}
}
