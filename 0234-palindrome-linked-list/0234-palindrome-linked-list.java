class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        slow = reverseList(slow);
        ListNode firstHalf = head;
        while (slow != null) {
            if (slow.val != firstHalf.val) {
                return false;
            }
            slow = slow.next;
            firstHalf = firstHalf.next;
        }

        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }

        return prev;
    }
}
