//LeetCode :- Maximum SubArray

class Solution {
    public int maxSubArray(int[] nums) {
        return solve(nums,0,nums.length-1);
    }
    public static int solve(int[] arr,int s,int e)
    {
        if(s==e)
        {
            return arr[s];
        }
            int mid=s+(e-s)/2;
            int leftSum=solve(arr,s,mid);
            int rightSum=solve(arr,mid+1,e);
            int rightMax=Integer.MIN_VALUE,rightBorder=0,leftMax=Integer.MIN_VALUE,leftBorder=0,crossBorder=0;
            for(int i=mid;i>=s;i--)
            {
                leftBorder+=arr[i];
                if(leftMax<leftBorder)
                {
                    leftMax=leftBorder;
                }
            }
            for(int i=mid+1;i<=e;i++)
            {
                rightBorder+=arr[i];
                if(rightMax<rightBorder)
                {
                    rightMax=rightBorder;
                }
            }
            crossBorder=leftMax+rightMax;

        return Math.max(leftSum,Math.max(rightSum,crossBorder));
    }
}