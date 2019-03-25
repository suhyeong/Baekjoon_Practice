import java.util.*;

public class prac_2438 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for(int i=0;i<x;i++) {
			for(int j=0;j<i+1;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
