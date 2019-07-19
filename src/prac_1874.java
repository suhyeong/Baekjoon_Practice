import java.util.*;
import java.io.*;

public class prac_1874 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int number = 1;
		int size = Integer.parseInt(bf.readLine());
		int array[] = new int[size];
		int poparray[] = new int[size];
		Stack<Integer> stack = new Stack();
		StringBuilder sb = new StringBuilder();
		int j = 0;
		
		for(int i=0;i<size;i++) {
			array[i] = Integer.parseInt(bf.readLine());
		} //input
		
		for(int i=0;i<size;i++) {
			if(number <= array[i]) {
				while(number <= array[i]) {
					stack.push(number);
					number++;
					sb.append("+\n");
				}
			}
			if(!stack.empty()) {
				while(stack.peek() >= array[i]) {
					poparray[j++] = stack.peek();
					stack.pop();
					sb.append("-\n");
					if(stack.empty())
						break;
				}
			}
		}
		
		if(Arrays.equals(array, poparray))
			bw.write(sb.toString());
		else
			bw.write("NO");
		
		bf.close();
		bw.close();
	}
}
