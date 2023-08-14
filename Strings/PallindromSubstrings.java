//LeetCode :- Pallindrome SubStrings 
/*
Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.
 */
class Solution{
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;
        for( int i=0;i<n-1;i++)
        {
            count+=expandCheck(s,i,i,n);
            count+=expandCheck(s,i,i+1,n);
        }
        return count+1;
    }

public static int expandCheck(String s,int left,int right,int n)
{
    int count=0;
    while(true)
    {
    if(left>=0 && right< n&& s.charAt(left)==s.charAt(right))
    {
        count++;
        left--;
        right++;
    }
    else
    {
        break;
    }
}
return count;
}
}