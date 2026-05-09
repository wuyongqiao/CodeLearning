package 相交链表;

import pojo.ListNode;

import java.util.List;
// 给你两个单链表的头节点 headA 和 headB ，
// 请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode pA=headA,pB=headB;
        int countA=1;
        int countB=1;
        while(pA!= null){
            pA=pA.next;
            countA++;
        }
        while(pB!= null){
            pB=pB.next;
            countB++;
        }
        pA=headA;
        pB=headB;
        if(countA > countB){
            int length = countA - countB;
            while (length >0){
                pA = pA.next;
                length--;
            }
        }else {
            int length = countB - countA;
            while (length > 0){
                pB = pB.next;
                length--;
            }
        }
        while (pA!=null && pB!=null && pA!= pB  ) {
            pA = pA.next;
            pB = pB.next;
        }
        return pA;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(6);
        listNode1.next.next = new ListNode(4);


        ListNode listNode2 =  new ListNode(6);
        listNode2.next = listNode1.next;
        Solution solution = new Solution();
        ListNode intersectionNode = solution.getIntersectionNode(listNode1, listNode2);
        if(intersectionNode!=null){
            System.out.println("Intersected at " + intersectionNode.val);
        }else {
            System.out.println("No intersection");
        }
    }
}
