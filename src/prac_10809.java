import java.util.*;

public class prac_10809 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		int alpa_loc[] = new int[26];
		Arrays.fill(alpa_loc, -1);
		
		for(int i=0;i<str.length();i++) {
			char tmp = str.charAt(i);
			int index = str.indexOf(tmp);
			alpa_loc[tmp-97] = index;
		}
		
		for(int j=0;j<alpa_loc.length;j++) {
			System.out.print(alpa_loc[j]+" ");
		}
	}
}