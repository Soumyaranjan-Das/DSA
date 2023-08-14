//LeetCode :-Remove Adjacent duplicate elements;
/*
You are given a string s consisting of lowercase English letters. 
A duplicate removal consists of choosing two adjacent and equal letters and removing them.

We repeatedly make duplicate removals on s until we no longer can.

Return the final string after all such duplicate removals have been made.
 It can be proven that the answer is unique.
  */

class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        if(n==1)
        {
            return s;
        }
        String start=s.charAt(0)+"";
        String ans=start;
        for (int i=1; i<n;i++)
        {
            if(ans.endsWith(s.charAt(i)+""))
            {
                ans=ans.substring(0,ans.length()-1);
            }
            else
            {
                ans=ans+s.charAt(i);
            }
        }
        return ans;
    }
}