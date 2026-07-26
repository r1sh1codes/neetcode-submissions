class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode l = head,r = head;
        ListNode prev = null;
        for(int i = 1; i <left;i++)
        {
            prev = l;
            l = l.next;
        }
        for(int i = 1; i<right;i++)
        {
            r = r.next;
        }
        ListNode nx = r.next;
        r.next = null;
        ListNode newh = null;
        if(prev == null)
        {   
            newh = rev(l);
            l.next = nx;

        }
        else
        {
            newh = rev(l);
            prev.next =newh;
            l.next =nx;
            
            // l.next = prev;
        }
        if(prev == null)
        return newh;
        else
        return head;
    }
    public ListNode rev(ListNode head)
    {
        ListNode prev = null;
        while(head!=null)
        {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}