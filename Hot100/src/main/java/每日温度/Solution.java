package 每日温度;

public class Solution {
    // 暴力解法
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ints = new int[temperatures.length];
        for (int i = 0; i < ints.length; i++) {
            for(int j = i+1; j < ints.length; j++){
                if(temperatures[j] > temperatures[i]){
                    ints[i] = j-i;
                    break;
                }else {
                    ints[i] = 0;
                }
            }
        }
        return ints;
    }
}
