import java.util.*;
import java.io.*;

public class prac_4949 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = bf.readLine();
		while(!str.equals(".")) {
			bw.write(bracket(str)+"\n");
			str = bf.readLine();
		}
		
		bf.close();
		bw.close();
	}
	
	static String bracket(String str) {
		Stack<Character> stack = new Stack();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c == '(')
				stack.push(c);
			else if(c == '[')
				stack.push(c);
			else if(c == ')') {
				if(!stack.empty() && stack.peek() == '(')
					stack.pop();
				else
					return "no";
			} else if(c == ']') {
				if(!stack.empty() && stack.peek() == '[')
					stack.pop();
				else
					return "no";
			}
		}
		
		if(stack.empty())
			return "yes";
		else
			return "no";
	}
}
