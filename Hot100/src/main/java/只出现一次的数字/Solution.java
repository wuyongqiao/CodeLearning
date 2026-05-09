package 只出现一次的数字;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
