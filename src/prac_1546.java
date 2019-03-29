import java.util.*;

public class prac_1546 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); //시험 본 과목의 개수
		
		int orig_grade[] = new int[n];
		double new_grade[] = new double[n];
		int max = orig_grade[0];
		
		double total = 0;
		
		for(int i=0;i<n;i++) {
			orig_grade[i] = s.nextInt();
			if(orig_grade[i] > max)
				max = orig_grade[i];
		}
		
		for(int j=0;j<n;j++) {
			new_grade[j] = (double)((orig_grade[j] / (double)max)*100);
			total += new_grade[j];
		}
		
		System.out.println(total/n);
	}
}
