import java.util.*;

public class prac_2752 {
	public static void main(String args[]) {
		int i, j, min, index = 0, temp;
		int array[] = new int[3];
		Scanner s = new Scanner(System.in);
		for(i=0;i<3;i++) {
			array[i] = s.nextInt();
		}
		
		for(i=0;i<3;i++) {
			min = 1000001;
			for(j=i;j<3;j++) {
				if(array[j] < min) {
					min = array[j];
					index = j;
				}
			}
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		
		for(i=0;i<3;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
