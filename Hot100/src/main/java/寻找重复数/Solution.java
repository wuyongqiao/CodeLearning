package 寻找重复数;

public class Solution {
    public static int findDuplicate(int[] nums) {
        int []res = new int[nums.length + 1];

        for (int i = 0; i < res.length; i++) {
            res[i] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if(res[nums[i]] == 1) {
                return  nums[i];
            }else {
                res[nums[i]] = 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int test[] = {3,1,3,4,2};
        int duplicate = findDuplicate(test);
        System.out.println(duplicate);
    }
}
