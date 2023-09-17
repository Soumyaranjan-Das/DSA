//LeetCode :- Rotate List
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
        int len=findLength(head);
        if(len==0 || len==1 || k%len==0)
        {
            return head;
        }
        len=len-(k%len)-1;
        ListNode temp=head;
        while(len>0)
        {
            temp=temp.next;
            len--;
        }
        ListNode newHead=temp.next;
        temp.next=null;
        temp=newHead;
        if(temp==null)
        {
            return newHead;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;

        return newHead;

    }
    public static int findLength(ListNode head)
    {
        int i=0;
        while(head!=null)
        {
            head=head.next;
            i++;
        }
        return i;
    }
}
