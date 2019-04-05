import java.util.*;

public class prac_5622 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String N = s.next();
		int seconds = 0;
		
		for(int i=0;i<N.length();i++) {
			char tmp = N.charAt(i);
			switch(tmp) {
			case 'A':
			case 'B':
			case 'C':
				seconds += 3;
				break;
			case 'D':
			case 'E':
			case 'F':
				seconds += 4;
				break;
			case 'G':
			case 'H':
			case 'I':
				seconds += 5;
				break;
			case 'J':
			case 'K':
			case 'L':
				seconds += 6;
				break;
			case 'M':
			case 'N':
			case 'O':
				seconds += 7;
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				seconds += 8;
				break;
			case 'T':
			case 'U':
			case 'V':
				seconds += 9;
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				seconds += 10;
				break;
			}
		}
		System.out.println(seconds);
	}
}
