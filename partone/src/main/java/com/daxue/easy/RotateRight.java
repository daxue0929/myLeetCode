package com.daxue.easy;

import java.util.List;

/**
 * @author daxue0929
 * @date 2023/4/26
 */

public class RotateRight {
    public static void main(String[] args) {

    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            temp = temp.next;
            len ++;
        }

        ListNode currentNode = head;
        ListNode nextNode = head.next;
        for (int i = 0; i < k % len; i++) {
            while (nextNode.next !=null) {
                currentNode = nextNode;
                nextNode = nextNode.next;
            }
            currentNode.next = null;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


}
