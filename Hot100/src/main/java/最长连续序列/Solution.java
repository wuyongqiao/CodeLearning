package 最长连续序列;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }
        int longestStreak = 0;
        for (Integer i : num_set) {
            if (!num_set.contains(i - 1)) {
                int currentNum = i;
                int currentStreak = 1;

                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }



        return longestStreak;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // 示例 1
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("输入: [100, 4, 200, 1, 3, 2]");
        System.out.println("输出: " + solution.longestConsecutive(nums1));
        

    }
}
