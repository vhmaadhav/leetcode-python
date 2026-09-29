// Last updated: 9/29/2026, 9:34:27 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Step 1: Create a dummy node to simplify edge cases (like removing the head)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Step 2: Move fast pointer so that there is a gap of n nodes between fast and slow
        // We move it n + 1 times so slow ends up at the node BEFORE the target
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Step 3: Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Step 4: Skip the nth node from the end
        slow.next = slow.next.next;

        // Return the actual head (dummy.next)
        return dummy.next;
    }
}