import java.util.*;
import java.io.*;

public class prac_2252 {
	static int N;
	static int M;
	static int[] indegree;
	static ArrayList<Integer>[] arr;
	
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		indegree = new int[N+1]; //진입차수
		arr = new ArrayList[N+1];
		for(int i=0;i<=N;i++) {
			arr[i] = new ArrayList<Integer>();
		}
		
		for(int i=1;i<=M;i++) {
			StringTokenizer stk = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(stk.nextToken());
			int b = Integer.parseInt(stk.nextToken());
			arr[a].add(b);
			indegree[b]++;
		}
		
		sort();
		
		bf.close();
	}
	
	static void sort() {
		int result[] = new int[N+1];
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=1;i<=N;i++) {
			if(indegree[i] == 0)
				q.add(i);
		}
		
		for(int i=1;i<=N;i++) {
			if(q.isEmpty()) {
				System.out.println("사이클 발생");
				break;
			}
			int x = q.poll();
			result[i] = x;
			for(int j=0;j<arr[x].size();j++) {
				int y = arr[x].get(j);
				if(--indegree[y] == 0)
					q.add(y);
			}
		}
		
		for(int i=1;i<=N;i++) {
			System.out.print(result[i]+" ");
		}
	}
}
