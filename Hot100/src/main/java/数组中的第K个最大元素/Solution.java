package 数组中的第K个最大元素;

import java.util.HashMap;
import java.util.LinkedList;

public class Solution {
    // 全是正数的时候可以用
    public int findKthLargest(int[] nums, int k) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        int[] count = new int[max+1];
        int temp = 0;
        for (int num : nums) {
            count[num]++;
        }
        for (int i = count.length - 1; i >= 0; i--) {
            if(count[i] !=0 ){
                for (int i1 = 0; i1 < count[i]; i1++) {
                    temp++;
                    if(temp == k)
                        return i;
                }
            }
            if(temp == k)
                return i ;
        }
        return temp ;
    }
    public static void main(String[] args) {
        int[] nums = {-1,-1};
        int k = 1;
        Solution solution = new Solution();
        int i = solution.findKthLargest(nums, k);
        System.out.println(i);
    }
}
