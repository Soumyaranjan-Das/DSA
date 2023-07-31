//LeetCode :- search in a rotated sorted array.
/*There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated 
at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is
[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).  */

class Solution {
    public int search(int[] arr, int target) {
      int s=0,e=arr.length-1;
      int pivot=-1;
      while(s<=e)
      {
          int mid=s+(e-s)/2;
          if(arr[mid]<=arr[0])
          {
              pivot=mid;
              e=mid-1;
          }
          else
          {
              s=mid+1;
          }
      }
     if(target<=arr[0])
     {
         return binarySearch(arr,target,pivot,arr.length-1);
     }
     return binarySearch(arr,target,0,pivot-1);
    }
    public static int binarySearch(int[] arr,int target, int s,int e)
    {
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(arr[mid]>target)
            {
                e=mid-1;
            }
            else 
            {
                s=mid+1;
            }
        }
        return -1;
    }
}