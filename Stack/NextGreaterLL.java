class Solution {
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st=new Stack<>();
        int n=findLength(head);
        int[] ans=new int[n];
        int j=0;
        while(head!=null)
        {
            ans[j++]=head.val;
            head=head.next;
        }
        st.push(0);
        for(int i=n-1;i>=0;i--)
        {
            while(st.peek()!=0 && st.peek()<=ans[i] )
            {
                st.pop();
            }
            int temp=ans[i];
            ans[i]=st.peek();
            st.push(temp);
        }
        return ans;
    }
    public static int findLength(ListNode head)
    {
        int len=0;
        while(head!=null)
        {
            len++;
            head=head.next;
        }
        return len;
    }
}