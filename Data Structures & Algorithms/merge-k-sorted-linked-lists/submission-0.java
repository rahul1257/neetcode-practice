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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(-1);

        Queue<ListNode> minHeap = new 
                PriorityQueue<>((a, b) -> a.val - b.val);
        for(ListNode list : lists) {
            minHeap.offer(list);
        }

        ListNode curr = head;
        while(!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            curr.next = node;
            curr = curr.next;

            if(node.next != null) {
                minHeap.offer(node.next);
            }
        }

        return head.next;
    }
}
