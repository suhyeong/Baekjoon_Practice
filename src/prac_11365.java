import java.io.*;

public class prac_11365 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		while(!str.equals("END")) {
			for(int i=str.length()-1;i>=0;i--) {
				System.out.print(str.charAt(i));
			}
			System.out.println();
			str = bf.readLine();
		}
	}
}
