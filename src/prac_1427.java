import java.util.*;
import java.io.*;
import java.lang.*;

public class prac_1427 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int size = (int) Math.log10(n)+1;
		Integer[] arr = new Integer[size];
		int num = n;
		int count = size-1;
		for(int i=0;i<size;i++) {
			arr[i] = (int) (num / Math.pow(10, count));
			num = (int) (num % Math.pow(10, count));
			count--;
		}
		Arrays.sort(arr, Comparator.reverseOrder());
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]);
		}
		bf.close();
	}
}
