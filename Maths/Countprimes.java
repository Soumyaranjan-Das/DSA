//LeetCode :- Count primes (Sieve of Eratosthenes algorthim) 

class Solution {
    public int countPrimes(int n) {
        boolean[] b=new boolean[n];
        int count=0;
        for(int i=2;i*i<=n;i++)
        {
            if(!b[i])
            {
                int j=i*i;
                while(j<n)
                {
                    b[j]=true;
                    j+=i;
                }
            }

        }
        for(int i=2;i<n;i++)
        {
            if(!b[i])
            {
                count++;
            }
        }
        return count;
    }
}