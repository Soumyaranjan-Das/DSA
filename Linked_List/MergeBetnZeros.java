//LeetCode :- Merge nodes in between zeros


  class ListNode {
         int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode mergeNodes(ListNode head) {
        if(head ==null || head.next==null)
        {
            return head;
        }
        ListNode curr=head,last=null,ans=new ListNode();
        ListNode temp=ans;

        int sum=0;
        while(curr!=null)
        {
            sum+=curr.val;
            if(curr.val==0)
            {
                if(last!=null)
                {
                    ans.next=new ListNode(sum);
                    ans=ans.next;
                    sum=0;
                }
                else
                {
                    ans.val=sum;
                }

                last=curr;
            }
            curr=curr.next;
        }
        return temp.next;
    }
}