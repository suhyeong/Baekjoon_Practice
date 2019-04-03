import java.util.*;

public class prac_2675 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt(); //테스트 케이스의 개수
		char arr[][] = new char[T][];
		
		for(int i=0;i<T;i++) {
			int N = s.nextInt();
			String str = s.next();
			arr[i] = new char[str.length()];
			for(int j=0;j<str.length();j++) {
				arr[i][j] = str.charAt(j);
				for(int k=0;k<N;k++) {
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}
	}
}
