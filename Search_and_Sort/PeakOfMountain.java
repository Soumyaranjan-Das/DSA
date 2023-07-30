//LeetCode :- Peak of Mountain Array
/*An array arr is a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that 
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity. */

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return solve(arr,0,arr.length-1,-1);
    }
    public static int solve(int[] arr,int s,int e,int ans)
    {
        if(s<e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1])
            {
                ans=mid;
                return solve(arr,s,mid,ans);
            }
            else
            {
                return solve(arr,mid+1,e,ans);
            }
        }
        return ans;
    }
}