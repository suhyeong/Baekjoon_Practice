import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class prac_2751 {
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
