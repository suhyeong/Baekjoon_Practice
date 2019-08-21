import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class prac_1431 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = Integer.parseInt(bf.readLine());
		String[] array = new String[size];
		
		for(int i=0;i<size;i++) {
			array[i] = bf.readLine();
		} //input
		
		//배열
		Arrays.sort(array, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) { //길이가 같다면 sum값으로 정렬
					int o1_sum = getSum(o1);
					int o2_sum = getSum(o2);
					if(o1_sum == o2_sum) { //sum도 같다면 사전순으로 정렬
						return o1.compareTo(o2);
					} else { //o1_sum != o2_sum
						return Integer.compare(o1_sum, o2_sum);
					}
				}
				return Integer.compare(o1.length(), o2.length()); //길이가 다르면 길이로 정렬
			}
		});
		
		for(int i=0;i<size;i++) {
			bw.write(array[i]+"\n");
		}
		
		bf.close();
		bw.close();
	}
	
	static int getSum(String a) {
		int n = a.length(), sum = 0;
		for(int i=0;i<n;i++) {
			if(a.charAt(i) - '0' <= 9 && a.charAt(i) - '0' >= 0) {
				sum += a.charAt(i) - '0';
			}
		}
		return sum;
	}
}
