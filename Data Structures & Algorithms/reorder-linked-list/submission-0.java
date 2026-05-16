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
    public void reorderList(ListNode head) {
     ListNode slow = head, fast = head;

     while(fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
     }   

     ListNode prev = null, curr = slow.next;
     ListNode next = slow.next = null;
     while(curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
     }
     
     ListNode first = head,
     second = prev;
     while(second != null) {
        ListNode next1 = first.next;
        ListNode next2 = second.next;
        first.next = second;
        second.next = next1;
        first = next1;
        second = next2;
     }
    }
}
