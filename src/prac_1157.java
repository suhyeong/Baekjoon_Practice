import java.util.*;

public class prac_1157 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine().toUpperCase();
		char strarr[] = new char[str.length()];
		int alpha[] = new int[26];
		int max = 0;
		char result = 0;
		
		for(int i=0;i<strarr.length;i++) {
			alpha[str.charAt(i)-65] += 1;
			if(alpha[str.charAt(i)-65] > max) {
				result = str.charAt(i);
				max = alpha[str.charAt(i)-65];
			} else if(max == alpha[str.charAt(i)-65]) {
				result ='?';
			}
		}
		System.out.println(result);
		
		//틀렸는데 왜 틀렸는지 알 수 없는 코드 ..
		//for(int i=0;i<strarr.length;i++) {
		//	strarr[i] = str.charAt(i);
		//	alpha[strarr[i] - 65] += 1;
		//}
		
		//for(int j=0;j<alpha.length;j++) {
		//	if(alpha[j] > max) {
		//		max = alpha[j];
		//		result = (char)(j+65);
		//	} else if(max != 0 && alpha[j] == max) {
		//		result = '?';
		//		break;
		//	}
		//}
		//System.out.println(result);
	}
}
