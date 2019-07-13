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
				//���� ���� ��ȣ��� ���ÿ� ���� ��ȣ�� �ִ´�.
				stack.push(str.charAt(i));
			else if(str.charAt(i) == ')') {
				//���� �ݴ� ��ȣ���
				if(!stack.empty())
					//������ ������� �ʰ� ���� ��ȣ�� ���ִٸ� pop()�Ѵ�.
					stack.pop();
				else
					//������ ������� �� �ݴ� ��ȣ�� �´ٸ� ������ VPS�� �ƴϴ�.
					return "NO";
			}
		}
		if(stack.empty()) //���� ������ ����ִٸ� ���� ��ȣ�� ���� pop() �Ǿ��ٴ� �Ҹ��̹Ƿ�
			return "YES";
		else //���� ������ ������� �ʴٸ� pop()���� ���� ���� ��ȣ�� �ִٴ� ���̹Ƿ�
			return "NO";
	}
}
