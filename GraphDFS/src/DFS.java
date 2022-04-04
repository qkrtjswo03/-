import java.util.List;
public class DFS {
	int N;	 // �׷��� ������ ��
	List<Edge>[] graph;
	private boolean[ ] visited;	// DFS ���� �� �湮�� ������ true�� �����.
	public DFS(List<Edge>[] adjList) { // ������
		N = adjList.length;
		graph = adjList;
		visited = new boolean [N];
		for (int i = 0; i < N; i++) visited[i] = false;  // �迭 �ʱ�ȭ
		for (int i = 0; i < N; i++) if (!visited[i]) dfs(i);
	}
	private void dfs(int i) {
		visited[i] = true;        // ���� i�� �湮�Ǿ� visited[i]�� true�� �����.
		System.out.print(i+" ");  // ���� i�� �湮�Ǿ����� ����Ѵ�.
		for (Edge e: graph[i]) {  // ���� i�� ������ �� ������ ����
			if (!visited[e.adjvertex]) { // ���� i�� ������ ������ �湮 �ȵǾ����� ���ȣ��
				dfs(e.adjvertex);
			}
		}
	}
}
