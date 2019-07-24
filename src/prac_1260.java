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
		N = Integer.parseInt(st.nextToken()); //정점 개수
		M = Integer.parseInt(st.nextToken()); //간선 개수
		int V = Integer.parseInt(st.nextToken()); //탐색시작 정점
		
		visited = new boolean[N+1];
		array = (ArrayList<Integer>[]) new ArrayList[N+1];
		
		//정점의 개수만큼 array 리스트 배열을 동적 생성한다.
		for(int i=0;i<N+1;i++) {
			array[i] = new ArrayList<Integer>();
		}
		
		//간선의 수만큼 array 리스트배열에 간선을 추가해준다.
		for(int i=0;i<M;i++) {
			StringTokenizer m_st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(m_st.nextToken());
			int b = Integer.parseInt(m_st.nextToken());
			//주의해야 할점 : DFS와 BFS는 방향 그래프가 아니기때문에 양쪽이 연결되어 있다는 것을 꼭 표시해줘야한다.
			array[a].add(b);
			array[b].add(a);
		}
		
		//방문할 수 있는 정점이 여러개인 경우에 정점 번호가 먼저 작은 것을 방문하기 위해 작은 값 순서대로 정렬한다.
		for(int i=0;i<array.length;i++) {
			Collections.sort(array[i]);
		}
		
		//탐색시작 정점 V부터 DFS를 수행한다.
		dfs(V);
		
		//DFS 수행이 끝난 후 BFS 수행을 하기전 visited[] 탐색 배열을 false로 초기화해준다.
		for(int i=0;i<visited.length;i++) {
			visited[i] = false;
		}
		System.out.println();
		
		//탐색시작 정점 V부터 BFS를 수행한다.
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
