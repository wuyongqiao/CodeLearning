package 找到所有数组中消失的数字;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int [nums.length];
        for (int i = 0; i < nums.length; i++){
            arr[nums[i] - 1] = 1;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                list.add(i + 1);
            }
        }
        return list;
    }
}
