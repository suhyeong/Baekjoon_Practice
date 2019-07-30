import java.util.*;
import java.io.*;

public class prac_10814 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		String[][] str = null;
		str = new String[n][2];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j=0;j<2;j++) {
				str[i][j] = st.nextToken();
			}
		}
		
		Arrays.sort(str, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				if(Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]) > 0)
					return 1;
				else if(Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]) == 0)
					return 0;
				else
					return -1;
			}
		});
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(str[i][j]+" ");
			}
			System.out.println();
		}
		
		bf.close();
	}
}
