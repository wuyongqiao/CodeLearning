package 回文链表;

import pojo.ListNode;

import java.util.ArrayList;

public class Solution {

    // 12321
        public boolean isPalindrome(ListNode head) {
            ListNode  node = head;
            ArrayList<Integer> list = new ArrayList<>();
            while (node != null) {
                list.add(node.val);
                node = node.next;
            }
            int length = list.size();
            for (int i = 0; i < length; i++) {
                if(list.get(i) != list.get(length-i-1)) {
                    return false;
                }
            }
            return true;

        }
}
