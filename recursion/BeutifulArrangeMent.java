//LeetCode := Beutiful Arrangement

class Solution {
    public static int ans=0;
    public int countArrangement(int n) {
       int[] nums=new int[n+1];
       ans=0;
        solve(nums,n,1);
        return ans;
    }
    public static void solve(int[] nums,int n,int index)
    {
     if(index==n+1)
     {
        ++ans;
        return;
     }
     for(int i=1;i<=n;i++)
     {
         if(nums[i]==0 &&(index%i==0 || i%index==0))
         {
             nums[i]=1;
             solve(nums,n,index+1);
             nums[i]=0;
         }
        
     }
    }
}