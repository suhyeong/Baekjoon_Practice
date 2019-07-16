import java.util.*;
import java.io.*;

public class prac_11004 {
	static int sorted[];
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		sorted = new int[N];
		
		st = new StringTokenizer(bf.readLine());
		for(int l=0;l<N;l++) {
			arr[l] = Integer.parseInt(st.nextToken());
		}
		
		mergeSort(arr, 0, N-1);
		System.out.println(arr[k-1]);
		
		bf.close();
	}
	
	static void merge(int[] data, int start, int middle, int end) {
		int i = start;
		int j = middle + 1;
		int k = start;
		
		while(i <= middle && j <= end) {
			if(data[i] <= data[j]) {
				sorted[k] = data[i];
				i++;
			} else {
				sorted[k] = data[j];
				j++;
			}
			k++;
		}
		
		if(i > middle) {
			for(int x=j;x<=end;x++) {
				sorted[k] = data[x];
				k++;
			}
		} else {
			for(int x=i;x<=middle;x++) {
				sorted[k] = data[x];
				k++;
			}
		}
		
		for(int x=start;x<=end;x++) {
			data[x] = sorted[x];
		}
	}
	
	static void mergeSort(int[] data, int start, int end) {
		if(start < end) {
			int middle = (start + end) / 2;
			mergeSort(data, start, middle);
			mergeSort(data, middle+1, end);
			merge(data, start, middle, end);
		}
	}
}
