import java.util.*;

public class prac_1110 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int newnum = n; //���ο� �� �� ����
		int x; //10�� �ڸ���
		int y; //1�� �ڸ���
		int add; //x+y
		int count = 0; //����Ŭ ����
		int z; //x�� y�� ���� ���� 10���� Ŭ �� ���� �ڸ� ���� ������ ����
		
		//���� n�� 10���� ���� ���� 10���ڸ���, �������� 1���ڸ���
		while(true) {
			x = newnum/10;
			y = newnum%10;
			add = x+y;
			if(add >= 10) {
				z = add%10; //���� ���� ���� �ڸ� �� ����
				newnum = y*10+z;
			} else
				newnum = y*10+add;
			count++;
			if(n == newnum)
				break;
		}
		System.out.println(count);
	}
}
