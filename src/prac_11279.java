import java.util.*;
import java.io.*;

public class prac_11279 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(new newComparator());
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(bf.readLine());
			if(num == 0) {
				if(q.isEmpty()) {
					System.out.println(0);
				} else
					System.out.println(q.poll());
			} else {
				q.add(num);
			}
		}
		bf.close();
	}
	
	static class newComparator implements Comparator<Integer> {
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			if(o1 < o2)
				return 1;
			else if(o1 == o2)
				return 0;
			else
				return -1;
		}
	}
}
