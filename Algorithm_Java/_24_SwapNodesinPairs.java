package com.mecewe.pat;

/**
 *24. Swap Nodes in Pairs
 *
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * You may not modify the values in the list's nodes, only nodes itself may be changed.
 *
 *
 * Example:
 *
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 */
public class _24_SwapNodesinPairs {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }

        ListNode list = new ListNode(0);
        ListNode temp = list;
        ListNode h = head.next;
        ListNode t = head;

        while (h != null){
            temp.next = h;
            h = h.next;
            temp.next.next = t;
            t.next = h;
            temp = temp.next.next;
            if(h != null){
                h = h.next;
                t = t.next;
            }else {
                break;
            }
        }

        return list.next;
    }
}
