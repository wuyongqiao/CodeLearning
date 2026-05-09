package 环形连表;

import pojo.ListNode;

import java.util.HashSet;

public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodes = new HashSet<>();
        while (head != null){
            if (nodes.contains(head)){
                return true;
            }else {
                nodes.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
