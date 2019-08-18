import java.util.*;
import java.io.*;

public class prac_1655 {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		PriorityQueue<minHeap> minq = new PriorityQueue<minHeap>();
		PriorityQueue<maxHeap> maxq = new PriorityQueue<maxHeap>();
		
		while(n != 0) {
			int num = Integer.parseInt(bf.readLine());
			
			if(maxq.size() > minq.size())
				minq.offer(new minHeap(num));
			else
				maxq.offer(new maxHeap(num));
			
			if(!minq.isEmpty() && !maxq.isEmpty() && minq.peek().x < maxq.peek().x) {
				int i = minq.poll().x;
				int j = maxq.poll().x;
				maxq.offer(new maxHeap(i));
				minq.offer(new minHeap(j));
			}
			
			System.out.println(maxq.peek().x);
			n--;
		}
		
		bf.close();
	}

	
	static class minHeap implements Comparable<minHeap> {
		private int x;
		
		public minHeap(int x) {
			this.x = x;
		}
		
		@Override
		public int compareTo(minHeap o) {
			// TODO Auto-generated method stub
			if(this.x < o.x)
				return -1;
			else if(this.x == o.x)
				return 0;
			else
				return 1;
		}
	}
	
	static class maxHeap implements Comparable<maxHeap> {
		private int x;
		
		public maxHeap(int x) {
			this.x = x;
		}
		
		@Override
		public int compareTo(maxHeap o) {
			// TODO Auto-generated method stub
			if(this.x > o.x)
				return -1;
			else if(this.x == o.x)
				return 0;
			else
				return 1;
		}
	}
}
