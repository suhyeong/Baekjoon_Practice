import java.util.*;

public class prac_8958 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		String str;
		char oxresult[][] = new char[N+1][];
		int grade[] = new int[N+1];
		int count = 1;
		
		for(int i=0;i<N+1;i++) {
			str = s.nextLine();
			oxresult[i] = new char[str.length()];
		  for(int j=0;j<str.length();j++) {
			  oxresult[i][j] = str.charAt(j);
			  if(oxresult[i][j] == 'O') {
				  grade[i] = grade[i] + count;
				  count += 1;
			  } else if(oxresult[i][j] == 'X') {
				  grade[i] = grade[i] + 0;
				  count = 1;
			  }
		  }
		  count = 1;
		}
		
		for(int k=1;k<grade.length;k++) {
			System.out.print(grade[k]+" ");
		}
	}
}
