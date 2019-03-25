import java.util.*;

public class prac_2440 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		
		for(int i=0;i<x;i++) {
			for(int j=x;j>i;j--)
				System.out.print("*");
			System.out.println();
		}
	}
}
