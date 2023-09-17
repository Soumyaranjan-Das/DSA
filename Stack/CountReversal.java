//GFG :- Count the Reversal( Count the minimum number of reversal to balance the paranthesis)

class Sol
{
    int countRev (String s)
    {
        int n=s.length();
        if(n%2!=0)
        {
            return -1;
        }
        
        Stack<Character> st=new Stack<>();
        
        int count=0;
        
        for(int i=0;i<n;i++)
        {
            if(!st.empty() && st.peek()=='{' && s.charAt(i)=='}')
            {
                st.pop();
            }
            else 
            {
                st.push(s.charAt(i));
            }
        }
        if(st.empty())
        {
            return 0;
        }
        while(!st.empty())
        {
            char ele=st.pop();
            if(ele==st.peek())
            {
                count++;
            }
            else
            {
                count+=2;
            }
            st.pop();
        }
        return count;
        
    }
}