import java.io.*;

public class prac_2751_quick {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		int array[] = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = Integer.parseInt(bf.readLine());
		}
		quickSort(array, 0, n-1);
		for(int i=0;i<n;i++) {
			bw.write(array[i]+"\n");
		}
		bf.close();
		bw.close();
	}
	
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
}
