package com.mecewe.pat;

import java.util.ArrayList;
import java.util.List;


/**
 * 23. Merge k Sorted Lists
 *
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 *
 * Example:
 *
 * Input:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * Output: 1->1->2->3->4->4->5->6
 * ]
 */
public class _23_MergekSortedLists {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        int min_index = 0;
        Boolean endFlag = false;

        ListNode listNode = head;
        while (!endFlag){
            endFlag = true;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < lists.length; i++) {
                if(lists[i] != null){
                    if(min >lists[i].val){
                        min = lists[i].val;
                        min_index = i;
                    }
                    endFlag = false;
                }
            }
            if(!endFlag){
                listNode.next = lists[min_index];
                listNode = listNode.next;
                lists[min_index] = lists[min_index].next;
            }

        }
        listNode.next = null;
        return head.next;

    }

}


