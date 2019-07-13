import java.util.*;
import java.io.*;

public class prac_10773 {
	public static void main(String args[]) throws IOException {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		int sum = 0;
		for(int i=0;i<size;i++) {
			int x = s.nextInt();
			if(x != 0) {
				stack.push(x);
			} else {
				stack.pop();
			}
		}
		
		while(!stack.empty()) {
			sum += stack.pop();
		}
		System.out.println(sum);
	}
}
