import java.util.*;
import java.io.*;

public class prac_10845 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		ArrayDeque q = new ArrayDeque();
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			String com = st.nextToken();
			switch(com) {
			case "push":
				q.offer(st.nextToken());
				break;
			case "front":
				if(!q.isEmpty())
					System.out.println(q.peekFirst());
				else
					System.out.println(-1);
				break;
			case "back":
				if(!q.isEmpty())
					System.out.println(q.peekLast());
				else
					System.out.println(-1);
				break;
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				if(q.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "pop":
				if(!q.isEmpty())
					System.out.println(q.poll());
				else
					System.out.println(-1);
				break;
			}
		}
		bf.close();
	}
}
