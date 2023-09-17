public class MinimumTargetSum {
   public static void main(String[] args) {
    int[] arr={1,2,3,5};
    System.out.println(solve(arr,11));
   }
   public static int solve(int[] arr ,int target)
   {
    if(target==0)
    {
        return 0;
    }
    if(target<0)
    {
        return Integer.MAX_VALUE;
    }
    int mini=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++)
    {
       int ans=solve(arr, target-arr[i]);
       if(ans!=Integer.MAX_VALUE)
       {
        mini=(mini>ans+1)?ans+1:mini;
       }
    }
    return mini;
   }
}
