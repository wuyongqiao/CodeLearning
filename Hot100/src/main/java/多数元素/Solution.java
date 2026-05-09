package 多数元素;

import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) > length / 2) {
                return key;
            }
        }
        return -1;
    }
}
