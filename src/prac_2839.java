import java.util.*;

//설탕 배달
public class prac_2839 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = 0; //3kg 봉지 개수
		int result = 0; //결과
		
		while(true) {
			if((n%5) == 0) {
				result = (int)(n/5) + x;
				break;
			} else if (n < 0) {
				result = -1;
				break;
			}
			n = n-3;
			x = x+1;
		}
		System.out.println(result);
	}
}
