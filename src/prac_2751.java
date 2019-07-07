import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class prac_2751 {
	/*
	public static void quickSort(int[] data, int start, int end) {
		if(start >= end)
			return;
		
		int key = start;
		int i = start + 1;
		int j = end;
		int temp;
		
		while(i <= j) {
			while(i <= end && data[i] <= data[key]) {
				i++;
			}
			while(data[j] >= data[key] && j > start) {
				j--;
			}
			if(i > j) {
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			} else {
				temp = data[j];
				data[j] = data[i];
				data[i] = temp;
			}
			
			quickSort(data, start, j - 1);
			quickSort(data, j+1, end);
		}
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int array[] = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = s.nextInt();
		}
		quickSort(array, 0, n-1);
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
	}*/
	
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		ArrayList<Integer> data = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			data.add(Integer.parseInt(bf.readLine()));
		}
		Collections.sort(data);
		for(int i=0;i<n;i++) {
			System.out.println(data.get(i));
		}
		bf.close();
	}
}
