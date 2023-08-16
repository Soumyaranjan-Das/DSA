//GFG :- Modular exponantial for large numbers 

class Solution
{
    public long PowMod(long x, long n, long m)
    {
       long ans=1;
       while(n>0)
       {
           if(n % 2!=0)
           {
               ans=(ans*x%m);
           }
          x=(x * x)%m;
           n=n/2;
       }
       return ans;
       
    }
}