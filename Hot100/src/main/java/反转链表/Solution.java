package 反转链表;

import pojo.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode newList = new ListNode();
        while (cur != null){
            ListNode next = newList.next;
            ListNode temp = cur.next;
            newList.next = cur;
            cur.next = next;
            cur = temp;
        }
        return  newList.next;

    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        System.out.println(new Solution().reverseList(node).val);
    }
}
