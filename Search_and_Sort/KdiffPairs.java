/*LeetCode :- 
Given an array of integers nums and an integer k, 
return the number of unique k-diff pairs in the array.

A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

0 <= i, j < nums.length
i != j
|nums[i] - nums[j]| == k 
*/

import java.util.TreeMap;
import java.util.Arrays;

class Solution {
    public int findPairs(int[] arr, int k) {
        Arrays.sort(arr);
        TreeMap<Integer, Integer> set = new TreeMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int ans = binarySearch(arr, i + 1, arr[i] + k);
            if (ans != -1) {
                set.put(arr[i], arr[ans]);
            }
        }
        return set.size();
    }

    public static int binarySearch(int[] arr, int s, int target) {
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}