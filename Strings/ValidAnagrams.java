class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int[] freqTable=new int[150];
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            freqTable[s.charAt(i)]++;
        }
        for(int i=0;i<n;i++)
        {
            freqTable[t.charAt(i)]--;
        }
        for(int i=97;i<133;i++)
        {
            if(freqTable[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}