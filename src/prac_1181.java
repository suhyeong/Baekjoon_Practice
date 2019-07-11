import java.util.*;
import java.io.*;

public class prac_1181 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		String array[] = new String[n];
		for(int i=0;i<n;i++) {
			array[i] = bf.readLine();
		}
		
		//길이로 정렬
		Arrays.sort(array, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		//같은 길이는 알파벳 순서대로 정렬
		int x, y, len, temp;
		for(x=0;x<n;x++) {
			len=array[x].length();
			for(y=x+1;y<n;y++) {
				temp = array[y].length();
				if(len != temp)
					break;
			}
			Arrays.sort(array, x, y);
		}
		
		for(int i=0;i<n;i++) {
			if(i -1 >= 0 && array[i].equals(array[i-1]))
				continue;
			bw.write(array[i]+"\n");
		}
		
		bf.close();
		bw.close();
	}
}
