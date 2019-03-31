import java.util.*;

public class prac_2920 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8};
		int inputarr[] = new int[8];
		int asc_status = 0;
		int des_status = 0;
		
		for(int i=0;i<8;i++) {
			inputarr[i] = s.nextInt();
			if(inputarr[i] == arr[i])
				asc_status++;
			else if(inputarr[i] == arr[7-i])
				des_status++;
		}
		
		if(asc_status == 8)
			System.out.println("ascending");
		else if(des_status == 8)
			System.out.println("descending");
		else
			System.out.println("mixed");
	}
}
