import java.util.Scanner;

public class prac_2439 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		for(int i=1;i<=x;i++) {
			for(int j=x-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<i+1;k++) 
				System.out.print("*");
			System.out.println();
		}
	}
}