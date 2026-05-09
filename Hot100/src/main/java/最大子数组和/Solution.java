package 最大子数组和;

public class Solution {
    public int maxSubArray(int[] nums) {
        int dp[] = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            dp[i] = Math.max(nums[i],dp[i-1] + nums[i]);
        }
        int max = dp[0];
        for(int i = 1; i < nums.length; i++){
            max = Math.max(max, dp[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(s.maxSubArray(nums));
    }
}
