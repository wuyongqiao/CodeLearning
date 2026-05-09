package 排序链表;

import pojo.ListNode;

import java.util.List;

class Solution {
    public ListNode sortList(ListNode head) {
        return sortList(head, null);
    }

    public ListNode sortList(ListNode head, ListNode tail) {
        if(head == null){
            return head;
        }
        // 剩一个节点
        if(head.next == tail){
            head.next = null;
            return head;
        }
        ListNode slow = head, fast = head;
        while (fast != tail && fast.next != tail){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;
        ListNode list1 = sortList(head, mid);
        ListNode list2 = sortList(mid, tail);
        return merge(list1, list2);
    }
    public ListNode merge(ListNode list1, ListNode list2){
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead;
        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        temp.next = list1 == null ? list2 : list1;
        return dummyHead.next;
    }

}