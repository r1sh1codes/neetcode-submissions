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
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
     head2 =  reverse(head2);
     //now merge 
     ListNode p = head;
     ListNode q = head2;
     while( q!= null)
     {
        ListNode pNext = p.next;
        ListNode qNext = q.next;
        p.next = q;
        q.next = pNext;
        p = pNext;
        q = qNext;
     }
    }
    public ListNode reverse(ListNode head2)
    {
        ListNode prev = null;
        while(head2!=null)
        {
            ListNode temp = head2.next;
            head2.next= prev;
            prev = head2;
            head2 = temp;
        }
        return prev;
    }

}
