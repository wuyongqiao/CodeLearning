package 环形连表II;

import pojo.ListNode;

import java.util.HashSet;

public class Solution2 {
    public ListNode detectCycle(ListNode head) {
        ListNode pos = head;
        HashSet<ListNode> nodes = new HashSet<>();
        while (pos != null){
            if (nodes.contains(pos)){
                return pos;
            }else {
                nodes.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }
}
