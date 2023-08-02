//GFG :- Aggrassive Cows Problem 
/*
You are given an array consisting of n integers which denote the position of a stall. 
You are also given an integer k which denotes the number of aggressive cows. 
You are given the task of assigning stalls to k cows such that the minimum distance between 
any two of them is the maximum possible.
The first line of input contains two space-separated integers n and k.
The second line contains n space-separated integers denoting the position of the stalls. 
*/
import java.util.Arrays;
class Solution {
    public static int solve(int n, int k, int[] arr) {
        Arrays.sort(arr);
        int s=0,e=arr[arr.length-1]-arr[0],ans=-1;
       
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(isPossibleSolution(arr,mid,k))
            {
                ans=mid;
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return ans;
    }
    public static boolean isPossibleSolution(int[] arr,int mid,int k)
    {
        int distance=arr[0],count=1;
        for(int i=1;i<arr.length;i++)
        {
          if(arr[i]-distance>=mid)
          {
              count++;
              distance=arr[i];
          }
          if(count==k)
              {
                  return true;
              }
        }
        return false;
    }
}