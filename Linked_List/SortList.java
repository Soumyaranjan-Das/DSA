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
//Leetcode :-Sort List (solved using merge sort)
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode mid=findMid(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;


        left=sortList(left);
        right=sortList(right);
        return merge(left,right);
    }
    public static ListNode findMid(ListNode head)
    {
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode merge(ListNode left,ListNode right)
    {
        if(left==null) return right;
        if(right==null) return left;
        ListNode ans=new ListNode();
        ListNode temp=ans;

        while(left!=null && right!=null)
        {
          if(left.val<right.val)
          {
              temp.next=left;
              left=left.next;
              temp=temp.next;
          }
          else
          {
              temp.next=right;
              right=right.next;
              temp=temp.next;
          }
        }
       if(left!=null)
       {
           temp.next=left;
       }
       if(right!=null)
       {
           temp.next=right;
       }
       return ans.next;
    }
}