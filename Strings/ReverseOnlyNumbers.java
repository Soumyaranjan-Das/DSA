//Leetcode:- REverse only letters
class Solution {
    public String reverseOnlyLetters(String s) {
        int n=s.length();
        char[] rev=new char[n];
        int j=0,i=n-1;
        for(;i>=0 && j<n;)
        {
            char ch=s.charAt(i);
            char v=s.charAt(j);
           if((v>=65 && v<=90)|| (v>=97 && v<=132))
            {
                if((ch>=65 && ch<=90)|| (ch>=97 && ch<=132))
                {
                  rev[j]=ch;
                  i--;
                  j++;
                }
                else
                {
                    i--;
                }
            }
            else
            {
                rev[j]=v;
                j++;
            }
        }
       while(j!=n)
       {
           rev[j]=s.charAt(j);
           j++;
       }
        return new String(rev);
    }
}