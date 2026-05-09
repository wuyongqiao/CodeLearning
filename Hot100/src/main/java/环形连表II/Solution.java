package 环形连表II;

import pojo.ListNode;

import java.util.HashSet;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
      ListNode solw = head;
      ListNode fast = head;
      while (fast != null){
          solw = solw.next;
          if(fast.next != null){
              fast = fast.next.next;
          }else {
              return null;
          }
          if(solw == fast){
              ListNode ptr = head;
              while (ptr != solw) {
                  ptr = ptr.next;
                  solw = solw.next;
              }
              return ptr;
          }
      }
      return null;
    }
}
