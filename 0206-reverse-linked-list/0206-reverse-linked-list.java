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
    public ListNode reverseList(ListNode head) {
        if(head == null)return null;
        return reverseHelper(null, head, head.next);
    }
    private ListNode reverseHelper(ListNode prev, ListNode curr, ListNode next ){
        curr.next = prev;
        if(next == null)return curr;
        return reverseHelper(curr, next, next.next);
    }
}