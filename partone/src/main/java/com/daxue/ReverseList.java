package com.daxue;

import com.sun.xml.internal.ws.api.model.CheckedException;

import java.util.List;

/**
 * 206翻转列表
 * 假设存在链表 1 → 2 → 3 → Ø，我们想要把它改成 Ø ← 1 ← 2 ← 3。
 * 在遍历列表时，将当前节点的 next 指针改为指向前一个元素。
 * 由于节点没有引用其上一个节点，因此必须事先存储其前一个元素。
 * 在更改引用之前，还需要另一个指针来存储下一个节点。
 * 不要忘记在最后返回新的头引用
 */
public class ReverseList {
    public static void main(String[] args) {

    }

    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode currNode = head;
            ListNode prev = null;
            while (currNode != null) {
                ListNode nextNode = currNode.next;
                currNode.next = prev;
                prev = currNode;
                currNode = nextNode;
            }
            return prev;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
