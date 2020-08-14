package com.daxue;


/**
 *
 * 没搞懂的题目
 * 不会做
 *
 */
public class MergeList {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    static class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode listNode = new ListNode();
            return listNode;
        }
    }

    static public class ListNode {
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


