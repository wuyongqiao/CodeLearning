package 每日温度;

import java.util.Arrays;
import java.util.HashMap;

public class Solution1 {
    // 暴力解法
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;  // 获取温度数组的长度
        int[] ans = new int[length];       // 结果数组，保存每一天的答案
        int[] next = new int[101];      // 结果数组，保存每一天的答案
        Arrays.fill(next, Integer.MAX_VALUE);
        for (int i = temperatures.length - 1; i >= 0; i--) {
            int warmerIndex = Integer.MAX_VALUE;
            for(int j = temperatures[i] + 1; j < 101; j++){
                if(next[j] < warmerIndex){
                    warmerIndex  = next[j];
                }
            }
            if (warmerIndex < Integer.MAX_VALUE){
                ans[i] = warmerIndex - i;
            }
            next[temperatures[i]] = i;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        Solution1 solution = new Solution1();
        int[] result = solution.dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result));
    }

}
