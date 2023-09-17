//LeetCode :-Merge Two Sorted Lists

class Solution {
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
