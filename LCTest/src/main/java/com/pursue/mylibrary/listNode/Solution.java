package com.pursue.mylibrary.listNode;

import java.util.List;

/**
 * 链表反转
 * Created by pursue on 5/22/21
 * Describe:
 */

public class Solution {
//    public ListNode ReverseList(ListNode head) {
//        ListNode pre = null;
//        ListNode cur = head;
//        while (cur!=null){
//            ListNode next = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = next;
//        }
//        return pre;
//    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 递归的方法
     * @param head
     * @return
     */
    public ListNode ReverseList(ListNode head) {
//        if (head ==null || head.next ==null){//链表为空，或者链表只有一个数据
//            return head;
//        }
//        ListNode rev = ReverseList(head.next);
//        head.next.next = head;
//        head = null;
//        return rev;
        ListNode cur = head;
        ListNode pre = null;

        while (cur!=null){
            ListNode next = cur.next;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}