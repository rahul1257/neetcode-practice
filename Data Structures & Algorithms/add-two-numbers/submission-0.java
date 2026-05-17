/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;

        ListNode curr1 = l1, curr2 = l2;
        ListNode head = new ListNode();
        ListNode curr = head;

        while(curr1 != null && curr2 != null) {
            int sum = curr1.val + curr2.val + c;
            int r = sum % 10;
            c = sum / 10;

            curr.next = new ListNode(r);
            curr = curr.next;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        while(curr1 != null) {
            int sum = curr1.val + c;
            curr.next = new ListNode(sum % 10);
            c = sum / 10;

            curr = curr.next;
            curr1 = curr1.next;
        }

        while(curr2 != null) {
            int sum = curr2.val + c;
            curr.next = new ListNode(sum % 10);
            c = sum / 10;

            curr = curr.next;
            curr2 = curr2.next;
        }

        if(c != 0) {
            curr.next = new ListNode(c);
        }
        
        return head.next;

    }
}
