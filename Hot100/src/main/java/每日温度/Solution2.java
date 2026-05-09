package 每日温度;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution2 {
//    单调栈记录
    public int[] dailyTemperatures(int[] temperatures) {
        LinkedList<Integer> stack = new LinkedList<>();
        int[] ans = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int index = stack.pop();
                ans[index] = i - index;
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        Solution2 solution = new Solution2();
        int[] result = solution.dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result));
    }
}
