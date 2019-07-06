import java.util.*;

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
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int array[] = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = s.nextInt();
		}
		Arrays.sort(array);
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
	}
}
