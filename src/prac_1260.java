import java.util.*;
import java.io.*;

public class prac_1260 {
	static boolean visited[];
	static ArrayList<Integer>[] array;
	static int N;
	static int M;
	
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken()); //���� ����
		M = Integer.parseInt(st.nextToken()); //���� ����
		int V = Integer.parseInt(st.nextToken()); //Ž������ ����
		
		visited = new boolean[N+1];
		array = (ArrayList<Integer>[]) new ArrayList[N+1];
		
		//������ ������ŭ array ����Ʈ �迭�� ���� �����Ѵ�.
		for(int i=0;i<N+1;i++) {
			array[i] = new ArrayList<Integer>();
		}
		
		//������ ����ŭ array ����Ʈ�迭�� ������ �߰����ش�.
		for(int i=0;i<M;i++) {
			StringTokenizer m_st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(m_st.nextToken());
			int b = Integer.parseInt(m_st.nextToken());
			//�����ؾ� ���� : DFS�� BFS�� ���� �׷����� �ƴϱ⶧���� ������ ����Ǿ� �ִٴ� ���� �� ǥ��������Ѵ�.
			array[a].add(b);
			array[b].add(a);
		}
		
		//�湮�� �� �ִ� ������ �������� ��쿡 ���� ��ȣ�� ���� ���� ���� �湮�ϱ� ���� ���� �� ������� �����Ѵ�.
		for(int i=0;i<array.length;i++) {
			Collections.sort(array[i]);
		}
		
		//Ž������ ���� V���� DFS�� �����Ѵ�.
		dfs(V);
		
		//DFS ������ ���� �� BFS ������ �ϱ��� visited[] Ž�� �迭�� false�� �ʱ�ȭ���ش�.
		for(int i=0;i<visited.length;i++) {
			visited[i] = false;
		}
		System.out.println();
		
		//Ž������ ���� V���� BFS�� �����Ѵ�.
		bfs(V);
		
		bf.close();
	}
	
	static void dfs(int x) {
		if(visited[x])
			return;
		visited[x] = true;
		System.out.print(x+" ");
		for(int z=0;z<array[x].size();z++) {
			int y = array[x].get(z);
			dfs(y);
		}
	}
	
	static void bfs(int x) {
		Queue<Integer> q = new LinkedList();
		q.add(x);
		visited[x] = true;
		
		while(!q.isEmpty()) {
			int y = q.peek();
			q.poll();
			System.out.print(y+" ");
			for(int z=0;z<array[y].size();z++) {
				int k = array[y].get(z);
				if(!visited[k]) {
					q.add(k);
					visited[k] = true;
				}
			}
		}
	}
}
