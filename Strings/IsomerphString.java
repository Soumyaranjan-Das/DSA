//LeetCode :- Isomerphic Strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(m!=n)
        {
            return false;
        }
        char[] ch=new char[150];
       int[] b=new int[150];
       for(int i=0;i<n;i++)
       {
           if(b[t.charAt(i)]==0)
           {
               ch[s.charAt(i)]=t.charAt(i);
               b[t.charAt(i)]=-1;
           }
           else if(ch[s.charAt(i)]!=t.charAt(i))
           {
               return false;
           }
       }
       for(int i=0;i<n;i++)
       {
        if(ch[s.charAt(i)]!=t.charAt(i))
           {
               return false;
           }
       }

      
        return true;
    }
}