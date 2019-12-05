import java.util.*;
import java.io.*;

public class prac_17298 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		Stack<Integer> stack = new Stack<Integer>();
		int[] result = new int[size];
		
		for(int i=0;i<size;i++) {
			stack.push(Integer.parseInt(st.nextToken()));
		} //input
				
		int pop = 0;
		int allmax = stack.peek();
		int max = 0;
		int j = size-2;
		result[size-1] = -1;
		while(j != -1) {
			pop = stack.pop();
			int num = stack.peek();
			
			if(pop > num) {
				result[j] = pop;
				max = pop;
			}
			else {
				if(allmax < num)
					allmax = num;
				
				if(max >= allmax) {
					if(max > num)
						result[j] = max;
				} else {
					if(allmax == num)
						result[j] = -1;
					else
						result[j] = max;
				}
			}
			
			j--;
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(result[i]+" ");
		}
		bf.close();
	}
}
