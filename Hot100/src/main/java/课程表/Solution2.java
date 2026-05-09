package 课程表;

import java.util.*;

public class Solution2 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 入度数组
        int[] indegree = new int[numCourses];

        Map<Integer, List<Integer>> map = new HashMap<>(); // 邻接表

        for (int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][0];
            int pre = prerequisites[i][1];

            indegree[course]++; // 课程的初始入度 +1

            // 构建邻接表
            map.computeIfAbsent(pre, k -> new ArrayList<>()).add(course);
        }

        // // 初始化队列：把所有入度为 0 的课程入队
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) queue.offer(i);
        }
        int count = 0;
        // BFS — 拓扑排序
        while (!queue.isEmpty()) {
            int selected = queue.poll();  // 当前选的课，出队
            count++;  // 已选课程 +1

            List<Integer> nextCourses = map.get(selected); // 和 JS 代码一样取后续课

            if (nextCourses != null) {
                for (int next : nextCourses) {
                    indegree[next]--;  // 后续课的入度 -1
                    if (indegree[next] == 0) {
                        queue.offer(next);  // 入度变 0，入队
                    }
                }
            }
        }

        return count == numCourses;  // 选课数量必须覆盖全部课程
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        int numCourses = 6;
        int[][] prerequisites = {
                {1, 0}, // 0 → 1
                {2, 0}, // 0 → 2
                {3, 1}, // 1 → 3
                {3, 2}, // 2 → 3
                {4, 3} // 3 → 4// 4 → 5
        };

        boolean result = solution.canFinish(numCourses, prerequisites);
        System.out.println("能否完成所有课程: " + result);
    }
}
