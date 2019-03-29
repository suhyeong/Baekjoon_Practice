import java.util.*;

public class prac_1110 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int newnum = n; //새로운 수 값 저장
		int x; //10의 자리수
		int y; //1의 자리수
		int add; //x+y
		int count = 0; //사이클 길이
		int z; //x와 y를 더한 값이 10보다 클 때 일의 자리 수를 저장할 변수
		
		//숫자 n을 10으로 나눈 몫은 10의자리수, 나머지는 1의자리수
		while(true) {
			x = newnum/10;
			y = newnum%10;
			add = x+y;
			if(add >= 10) {
				z = add%10; //더한 값의 일의 자리 수 저장
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
