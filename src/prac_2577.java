import java.util.*;

public class prac_2577 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int count[] = new int[10];
		
		int result = A*B*C;
		String str = String.valueOf(result);
		char arr[] = new char[str.length()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = str.charAt(i);
			switch(arr[i]) {
				case '0':
					count[0] += 1;
					break;
				case '1':
					count[1] += 1;
					break;
				case '2':
					count[2] += 1;
					break;
				case '3':
					count[3] += 1;
					break;
				case '4':
					count[4] += 1;
					break;
				case '5':
					count[5] += 1;
					break;
				case '6':
					count[6] += 1;
					break;
				case '7':
					count[7] += 1;
					break;
				case '8':
					count[8] += 1;
					break;
				case '9':
					count[9] += 1;
					break;
			}
		}
		
		for(int j=0;j<10;j++) {
			System.out.println(count[j]);
		}
	}
}
