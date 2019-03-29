import java.util.*;

public class prac_11721 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		char arr[] = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i] = str.charAt(i);
			System.out.print(arr[i]);
			if(((i+1)%10)==0)
				System.out.println();
		}
	}
}
