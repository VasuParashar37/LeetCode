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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        ListNode newHead;
        int size=findSize(temp);
        if(head==null)
            return null;
        if(k==size || k==0 || size==1)
            return head;
        else{
            int numberOfRotations=k%size;
            if(numberOfRotations==0)
                return head;
            int i=1;
            while(i < size-numberOfRotations){
                i++;
                temp=temp.next;
            }
            newHead=temp.next;
            temp.next=null;
            temp=newHead;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=head;
        }
        return newHead;
    }
    public int findSize(ListNode temp){
        int i=0;
        while(temp!=null){
            temp=temp.next;
            i++;
        }
        return i;
    }
}