import java.util.*;

public class prac_10039 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int grade[] = new int[5];
		int total = 0;
		
		for(int i=0;i<5;i++) {
			grade[i] = s.nextInt();
			if(grade[i] < 40) {
				grade[i] = 40;
				total += grade[i];
			} else
				total += grade[i];
		}
		System.out.println(total/5);
	}
}
