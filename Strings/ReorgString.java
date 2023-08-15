//Leetcode :- Reorganize String

class Solution {
    public String reorganizeString(String s) {
        int n=s.length();
        int[] map=new int[26];
        int max=0;
        char ch='a';
        char[] res=new char[n];
        for(int i=0;i<n;i++)
        {
            map[s.charAt(i)-'a']++;
            if(map[s.charAt(i)-'a']>max)
            {
                max=map[s.charAt(i)-'a'];
                ch=s.charAt(i);
            }
        }
        int k=0;
        for(;k<n && map[ch-'a']!=0;k+=2)
        {
            res[k]=ch;
            map[ch-'a']--;
        }
        if(map[ch-'a']!=0)
        {
            return "";
        }
        int j=1;
        for(int i=0;i<26;i++)
        {
            while(map[i]!=0)
            {
                k= k>=n?1:k;
                res[k]=(char)(i+'a');
                map[i]--;
                k+=2;
            }
        }
        return new String(res);

    }
}