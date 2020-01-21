import java.util.*;

public class prac_2292 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		
		System.out.println(honeycomb(n));
	}
	
	static long honeycomb(long num) {
		long result = 1; //�ּ� ������ ��
		long range = 1; //1, 2~7, 8~19, ... �϶� �� ������ �� ����
		long tmp = 1; //6�� ����� ����
		
		while(true) {
			if(range >= num)
				break;
			tmp = 6 * (result++);
			range += tmp;
		}
		
		return result;
	}
}
