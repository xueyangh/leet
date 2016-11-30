/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // get the length
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        int indexToRemove = length - n;
        if (indexToRemove == 0) {
            return head.next;
        }
        curr = head;
        for (int i = 1; i < indexToRemove; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}
