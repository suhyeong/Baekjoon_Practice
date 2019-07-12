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
		
		//길이로 배열
		Arrays.sort(array, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		//길이가 같을때
		int x,y,len1,len2;
		for(x=0;x<size;x++) {
			len1=array[x].length();
			for(y=x+1;y<size;y++) {
				len2 = array[y].length();
				if(len1 != len2)
					break;
			}
			//길이가 같은 범위 x~y
			int x_sum = getSum(array[x]);
			for(int k=x+1;k<y;k++) {
				int y_sum = getSum(array[k]);
				if(x_sum != y_sum) {
					Arrays.sort(array, k, y, new Comparator<String>() {
						@Override
						public int compare(String o1, String o2) {
							return Integer.compare(getSum(o1), getSum(o2));
						}
					});
				}
			}
		}
		
		//길이가 같고 숫자의 합이 다른 것들 정렬 후 길이가 같고 숫자의 합이 같은 것 정렬
		for(x=0;x<size;x++) {
			int x_sum2 = getSum(array[x]);
			for(y=x+1;y<size;y++) {
				int y_sum2 = getSum(array[y]);
				if(x_sum2 != y_sum2)
					break;
			}
			//숫자의 합이 같은 범위 x~y
			Arrays.sort(array, x, y);
		}
		
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
