import java.io.*;

public class prac_2751_merge {
	static int sorted[];
	
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		sorted = new int[n];
		int array[] = new int[n];
		for(int l=0;l<n;l++) {
			array[l] = Integer.parseInt(bf.readLine());
		}
		mergeSort(array, 0, n-1);
		for(int l=0;l<n;l++) {
			bw.write(array[l]+"\n");
		}
		bf.close();
		bw.close();
	}
	
	static void merge(int[] arr, int start, int middle, int end) {
		int i=start;
		int j=middle+1;
		int k=start;
		
		while(i<=middle && j<=end) {
			if(arr[i] <= arr[j]) {
				sorted[k] = arr[i];
				i++;
			} else {
				sorted[k] = arr[j];
				j++;
			}
			k++;
		}
		
		if(i>middle) {
			for(int x=j;x<=end;x++) {
				sorted[k] = arr[x];
				k++;
			}
		} else {
			for(int x=i;x<=middle;x++) {
				sorted[k] = arr[x];
				k++;
			}
		}
		
		for(int x=start;x<=end;x++) {
			arr[x] = sorted[x];
		}
	}
	
	static void mergeSort(int[] arr, int start, int end) {
		if(start < end) {
			int middle = (start + end) / 2;
			mergeSort(arr, start, middle);
			mergeSort(arr, middle + 1, end);
			merge(arr, start, middle, end);
		}
	}
}
