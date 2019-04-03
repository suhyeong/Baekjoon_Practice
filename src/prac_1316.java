import java.util.*;

public class prac_1316 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); //그룹단어 개수
		char strarr[][] = new char[N][];
		int indexarr[][] = new int[N][];
		int num = N;
		
		for(int i=0;i<N;i++) {
			String str = s.next();
			strarr[i] = new char[str.length()];
			indexarr[i] = new int[str.length()];
			
			for(int j=0;j<str.length();j++) {
				strarr[i][j] = str.charAt(j);
				if(j > 0) {
					indexarr[i][j] += indexarr[i][j-1] + 1;
				} else
					indexarr[i][j] = 1;
			}
			
			if(str.length() > 1) {
				outerloop:
					for(int x=0;x<str.length();x++) {
						for(int k=x+1;k<str.length();k++) {
							if(strarr[i][x] == strarr[i][k]) {
								if(indexarr[i][k] - indexarr[i][x] == 1)
									break;
								else if(indexarr[i][k] - indexarr[i][x] != 1) {
									num--;
									break outerloop;
								}
							}
						}
					}
			}
		}
		System.out.println(num);
	}
}
