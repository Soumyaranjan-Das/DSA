//Leetcode :- largest number 

class Helper implements Comparator<String>
{
    public int compare(String s1,String s2)
    {
        String t1=s1+s2;
        String t2=s2+s1;
        return -(t1.compareTo(t2)==0?1:t1.compareTo(t2));
    }
}

class Solution {
    public String largestNumber(int[] nums) {
        TreeSet<String> set=new TreeSet<>(new Helper());
        String ans="";
        boolean b=true;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                b=false;
            }
            set.add(nums[i]+"");
        }
        if(b)
        {
            return "0";
        }
        for(String s:set)
        {
            ans+=s;
        }
        return ans;
    }
}