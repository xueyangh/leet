/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode result = null;
        ListNode select = head;
        while (select != null) {
            ListNode next = select.next;
            ListNode sorted = result;
            ListNode prev = null;
            while (sorted != null && select.val > sorted.val) {
                prev = sorted;
                sorted = sorted.next;
            }
            if (prev == null) {
                result = select;
                select.next = sorted;
            } else {
                prev.next = select;
                select.next = sorted;
            }
            select = next;
        }
        return result;
    }
}
