
//Leetcode :- String compression

class Solution {
    public int compress(char[] chars) {
      int j=0,n=chars.length,pointer=0;
      for(int i=0;i<n;)
      {
          int count=0;
          while(j<n && chars[i]==chars[j])
          {
              count++;
              j++;
          }
          chars[pointer++]=chars[i];
          if(count>1)
          {
              String s=""+count;
              for(int k=0;k<s.length();k++)
              {
                  chars[pointer++]=s.charAt(k);
              }
          }
        i=j;
      }
      return pointer;
    }
}