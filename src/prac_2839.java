import java.util.*;

//���� ���
public class prac_2839 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = 0; //3kg ���� ����
		int result = 0; //���
		
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
