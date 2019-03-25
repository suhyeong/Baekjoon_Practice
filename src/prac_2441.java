import java.util.Scanner;

public class prac_2441 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		for(int i=0;i<x;i++) {
			for(int k=1;k<i+1;k++)
				System.out.print(" ");
			for(int j=x;j>i;j--)
				System.out.print("*");
			System.out.println();
		}
	}
}
