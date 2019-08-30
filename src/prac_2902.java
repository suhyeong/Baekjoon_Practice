import java.io.*;

public class prac_2902 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		String[] strarr = str.split("-", -1);
		for(int i=0;i<strarr.length;i++) {
			System.out.print(strarr[i].charAt(0));
		}
		bf.close();
	}
}
