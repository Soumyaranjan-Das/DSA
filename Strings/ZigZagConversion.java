//Leetcode :- ZigZag conversion

class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)
        {
            return s;
        }
        String ans="";
        int count=0;
        int i=0,j=2*numRows-2;
        while(count<s.length())
        {
            int val=(j-i*2==0?j:j-i*2);
            int pos=i;
           while(pos<s.length())
           {
               ans+=s.charAt(pos);
               count++;
               pos+=val;
               val=(j-val==0?j:j-val);
               
           }
           i++;
        }
        return ans;
    }
}