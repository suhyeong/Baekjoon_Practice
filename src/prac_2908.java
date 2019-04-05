import java.util.*;

public class prac_2908 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		char arr[][] = new char[2][3];
		
		for(int i=0;i<2;i++) {
			String str = s.next();
			for(int j=0;j<3;j++) {
				arr[i][j] = str.charAt(2-j);
			}
		}
		if(arr[0][0] > arr[1][0])
			System.out.println(arr[0]);
		else if(arr[0][0] == arr[1][0]) {
			if(arr[0][1] == arr[1][1]) {
				System.out.println((arr[0][2] > arr[1][2]) ? arr[0] : arr[1]);
			}
			else
				System.out.println((arr[0][1] > arr[1][1]) ? arr[0] : arr[1]);
		}
		else
			System.out.println(arr[1]);
	}
}
