import java.lang.*;

public class prac_4673 {
	
	static int number = 10036;
	static int a[] = new int[number+1];
	
	public static void main(String args[]) {
		notSelfnumber();
	}
	
	public static void notSelfnumber() {
		for(int i = 1;i<=10000;i++) {
			a[dn(i)] = 1;
			if(a[i] != 1)
				System.out.println(i);
		}
	}
	
	public static int dn(int i) {
		int res = i;
		if(i >= 10000) {
			res += i/10000;
			i %= 10000;
		}
		if(i >= 1000) {
			res += i/1000;
			i %= 1000;
		}
		if(i >= 100) {
			res += i/100;
			i %= 100;
		}
		if(i >= 10) {
			res += i/10;
			i %= 10;
		}
		
		return res += i;
	}
}
