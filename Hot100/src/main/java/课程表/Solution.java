package 课程表;

import java.util.*;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 存储结果，可选，不是必须
        LinkedList<Integer> result = new LinkedList<>();

        // 每个课程的入度
        int[] indegree = new int[numCourses];

        // 邻接表：key 是前置课程，value 是依赖它的课程列表
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < numCourses; i++) {
            graph.put(i, new ArrayList<>());
        }

        // 构建图 + 统计入度
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];   // 目标课程
            int pre = prerequisite[1];      // 前置课程

            graph.get(pre).add(course);
            indegree[course]++;             // 目标课程入度 +1
        }

        // 初始化队列：入度为 0 的课程
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) queue.offer(i);
        }

        // BFS 拓扑排序
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            result.add(cur);

            for (int next : graph.get(cur)) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }

        // 如果能拿到所有课程，就说明没有环
        return result.size() == numCourses;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int num = 5;

        int[][] pre2 = {{1,4},{2,4},{3,1},{3,2}};  // 环 → 无法完成
        System.out.println(s.canFinish(num, pre2));
    }
}
