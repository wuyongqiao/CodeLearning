package 深度优先搜索;

import java.util.*;

public class DFSExample {

    // 邻接表：graph[u] 表示 u 的所有相邻节点
    private List<Integer>[] graph;

    // 访问标记
    private boolean[] visited;

    public DFSExample(int n) {
        graph = new ArrayList[n];
        visited = new boolean[n];

        // 初始化每个节点的列表
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
    }

    // 添加边
    public void addEdge(int from, int to) {
        graph[from].add(to);
        // 如果是无向图，也可以加这句：
        // graph[to].add(from);
    }

    // 深度优先搜索
    public void dfs(int node) {
        if (visited[node]) return;

        visited[node] = true;
        System.out.println("访问节点：" + node);

        for (int next : graph[node]) {
            dfs(next);
        }
    }

    public static void main(String[] args) {
        DFSExample dfs = new DFSExample(6);

        // 构建图（0~5）
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 3);
        dfs.addEdge(1, 4);
        dfs.addEdge(2, 5);

        System.out.println("从 0 开始 DFS：");
        dfs.dfs(0);
    }
}
