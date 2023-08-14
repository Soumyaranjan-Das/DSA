//Leetcode :- Longest commong prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
       
        String ans="";
        int i=0;
        String s=strs[0];
       while(true)
        {
            boolean b=true;
            for(int j=0;j<n;j++)
            {
                if(i==strs[j].length())
                {
                    b=false;
                    break;
                }
               if(s.charAt(i)!=strs[j].charAt(i))
               {
                   b=false;
                   break;
               }
            }
            if(b)
            {
                ans=ans+s.charAt(i);
            }
            else
            {
                break;
            }
            i++;
        }
        return ans;
    }
}