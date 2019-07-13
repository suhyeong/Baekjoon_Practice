import java.util.*;
import java.io.*;

public class prac_10828 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int size = Integer.parseInt(bf.readLine());
		String str[] = new String[size];
		for(int i=0;i<size;i++) {
			str[i] = bf.readLine();
		}
		
		Stack<Integer> stack = new Stack();
		for(int i=0;i<size;i++) {
			if(str[i].contains("push")) {
				int x = Integer.parseInt(str[i].substring(5, str[i].length()));
				stack.push(x);
			} else if(str[i].equals("top")) {
				if(stack.empty())
					bw.write("-1\n");
				else
					bw.write(stack.peek()+"\n");
			}
			else if(str[i].equals("size"))
				bw.write(stack.size()+"\n");
			else if(str[i].equals("empty")) {
				if(stack.empty())
					bw.write("1\n");
				else
					bw.write("0\n");
			} else if(str[i].equals("pop")) {
				if(stack.empty())
					bw.write("-1\n");
				else
					bw.write(stack.pop()+"\n");
			}
		}
		
		bf.close();
		bw.close();
	}
}
