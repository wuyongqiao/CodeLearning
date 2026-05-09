package 深度优先搜索;

import java.util.*;
import java.util.*;

public class Solution {

    public void dfs(int u, Integer[][] graph, boolean[] visited) {
        visited[u] = true;
        System.out.println(u);   // 访问节点
        int n = graph.length;

        // 遍历所有可能的邻接点
        for (int v = 0; v < n; v++) {
            // graph[u][v] != null 并且 > 0 代表有边
            if (graph[u][v] != null && graph[u][v] > 0 && !visited[v]) {
                dfs(v, graph, visited);
            }
        }
    }

    public static void main(String[] args) {

        Integer[][] graph = {
                {1, 2, 3, 4, 5},
                {7, 8, 9, 10, 11},
                {12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21},
                {22, 23, 24, 25, 26}
        };

        boolean[] visited = new boolean[graph.length];
        new Solution().dfs(0, graph, visited);   // 从 0 节点开始 DFS
    }
}
