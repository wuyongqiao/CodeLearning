package 多数元素;

public class Solution2 {
    public static int majorityElement(int[] nums) {
        int count = 0;
       Integer candidate = null;
       for (int num : nums) {
           if (count == 0) {
               candidate = num;
           }
           if (num == candidate){
               count++;
           }else{
               count--;
           }
       }
       return candidate;
    }

    public static void main(String[] args) {
        int a[] = {1,2,2,2,3,4,2};
        System.out.println(majorityElement(a));
    }
}
