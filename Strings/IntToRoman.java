//Leetcode :- Integer to Roman

class Solution {
    public String intToRoman(int num) {
        String[] symbols={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] values={1,4,5,9,10,40,50,90,100,400,500,900,1000,};
        String ans="";
        for(int i=12;i>=0;i--)
        {
            while(num>=values[i])
            {
                ans+=symbols[i];
                num-=values[i];
            }
        }
        return ans;
    }
}