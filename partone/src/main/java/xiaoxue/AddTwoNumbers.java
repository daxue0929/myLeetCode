package xiaoxue;

import com.daxue.MergeList;
import common.ListNode;

/**
 * @author daxue0929
 * @date 2022/3/4
 */

public class AddTwoNumbers {
    public static void main(String[] args) {


    }

}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 *
 *     输入 [2,4,3]
 *         [5,6,4]
 *     输出 [7,0]
 *     预计 7 0 8
 *
 *
 *     最后输出
 *     [9,9,9,9]
 *     [9,9]
 *     8 9
 *
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode A = l1;
        ListNode B = l2;
        ListNode currentResultNode = listNode;
        int nextValue = 0;
        while (true) {
            int firstValue = 0;
            int secondValue = 0;
            if (A != null) {
                firstValue = A.val;
            }
            if (B != null) {
                secondValue = B.val;
            }
            int i = firstValue + secondValue + nextValue;
            currentResultNode.val = i % 10;
            nextValue = i / 10;
            if (A != null) {
                A = A.next;
            }
            if (B != null) {
                B = B.next;
            }
            if (A != null || B != null){
                ListNode sumNode = new ListNode();
                currentResultNode.next = sumNode;
                currentResultNode = currentResultNode.next;
                continue;
            }else if(A == null && B == null) {
                if (nextValue != 0) {
                    ListNode sumNode = new ListNode();
                    sumNode.val = nextValue;
                    currentResultNode.next = sumNode;
                }
            }
            break;
        }
        return listNode;
    }
}
