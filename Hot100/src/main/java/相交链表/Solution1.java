package 相交链表;

import pojo.ListNode;

public class Solution1 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);
        ListNode pA = headA;
        ListNode pB = headB;
        int k = 0;
        if(lengthA > lengthB){
            k = lengthA - lengthB;
            while (k > 0){
                pA = pA.next;
                k--;
            }
        }else if(lengthA < lengthB){
            k = lengthB - lengthA;
            while (k > 0){
                pB = pB.next;
                k--;
            }
        }
        // 开始比较
        while (pA != null && pB != null && pA != pB){
            pA = pA.next;
            pB = pB.next;
        }
        return pA;
    }
    // 获取链表的长度
    public int getLength(ListNode node){
        int length = 0;
        while (node != null){
            length++;
            node = node.next;
        }
        return length;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);
        head1.next.next.next = new ListNode(5);
        head1.next.next.next.next = new ListNode(4);

        // 创建第二个链表 [2, 4, 5, 4]
        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(5);
        head2.next.next.next = new ListNode(4);

        ListNode node = new Solution1().getIntersectionNode(head1, head2);
        System.out.println(node.val);

    }
}