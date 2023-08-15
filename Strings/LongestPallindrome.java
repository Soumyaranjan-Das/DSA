//Leetcode :- longest pallindromic substring
class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String res="";
        for(int i=0;i<n;i++)
        {
            String s1=expandCheck(s,i,i);
            String s2=expandCheck(s,i,i+1);
            if(s1.length()>s2.length())
            {
                if(res.length()<s1.length())
                {
                    res=s1;
                }
            }
            else
            {
                if(res.length()<s2.length())
                {
                    res=s2;
                }
            }
        }
        return res;
    }
    public static String expandCheck(String s,int left,int right)
    {
        String res="";
        while((left>=0 && right<s.length()) && s.charAt(left)==s.charAt(right))
        {
            if(left!=right)
            {
            res=s.charAt(left)+res+s.charAt(right);
            }
            else
            {
                res=res+s.charAt(left);
            }
            left--;
            right++;
        }
        return res;
    }
}