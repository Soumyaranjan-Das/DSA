//Leetcode :- Reverse only vowels 
class Solution {
    public String reverseVowels(String s) {
        int left=0,right=s.length()-1,n=s.length();
        char[] ch=s.toCharArray();
        while(left<=right)
        {
            while(left<=right && "aeiouAEIOU".indexOf(s.charAt(left))==-1)
            {
                ch[left]=s.charAt(left);
                left++;
            }
             while(left <=right &&"aeiouAEIOU".indexOf(s.charAt(right))==-1)
            {
                ch[right]=s.charAt(right);
                right--;
            }
            if(left<=right)
            {
                ch[left]=s.charAt(right);
                ch[right]=s.charAt(left);
                left++;
                right--;
            }
          
        }
        return new String(ch);
    }
}