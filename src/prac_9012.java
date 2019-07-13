import java.util.*;
import java.io.*;

public class prac_9012 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = Integer.parseInt(bf.readLine());
		for(int i=0;i<size;i++) {
			String str = bf.readLine();
			bw.write(vps(str)+"\n");
		}
		
		bf.close();
		bw.close();
	}
	
	static String vps(String str) {
		Stack<Character> stack = new Stack();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '(')
				//만약 여는 괄호라면 스택에 여는 괄호를 넣는다.
				stack.push(str.charAt(i));
			else if(str.charAt(i) == ')') {
				//만약 닫는 괄호라면
				if(!stack.empty())
					//스택이 비어있지 않고 여는 괄호가 들어가있다면 pop()한다.
					stack.pop();
				else
					//스택이 비어있을 때 닫는 괄호가 온다면 무조건 VPS가 아니다.
					return "NO";
			}
		}
		if(stack.empty()) //만약 스택이 비어있다면 여는 괄호가 전부 pop() 되었다는 소리이므로
			return "YES";
		else //만약 스택이 비어있지 않다면 pop()되지 않은 여는 괄호가 있다는 뜻이므로
			return "NO";
	}
}
