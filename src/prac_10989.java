import java.io.*;

public class prac_10989 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int array[] = new int[10001];
		for(int i=0;i<n;i++) {
			array[Integer.parseInt(bf.readLine())]++;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=1;i<10001;i++) {
			while(array[i] != 0) {
				bw.write(Integer.toString(i)+"\n");
				array[i]--;
			}
		}
		bf.close();
		bw.close();
	}
}