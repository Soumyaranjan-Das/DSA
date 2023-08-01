/*LeetCode :- Find k closest elements.
Given a sorted integer array arr, two integers k and x, 
return the k closest integers to x in the array. The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if:

|a - x| < |b - x|, or
|a - x| == |b - x| and a < b */

import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> list=new ArrayList<>();
      int l=0,r=arr.length-1;
      while(r-l >= k)
      {
          if(Math.abs(arr[l]-x)<=Math.abs(arr[r]-x))
          {
              r--;
          }
          else
          {
              l++;
          }
      }
      for(int i=l;i<=r;i++)
      {
          list.add(arr[i]);
      }
      return list;
    }
}