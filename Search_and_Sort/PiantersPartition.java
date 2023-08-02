//GFG :- Painters Partition Problem
/*
 Dilpreet wants to paint his dog's home that has n boards with different lengths. 
 The length of ith board is given by arr[i] where arr[] is an array of n integers.
He hired k painters for this work and each painter takes 1 unit time to paint 1 unit of the board. 

The problem is to find the minimum time to get this job done if all painters 
start together with the constraint that any painter will only paint continuous boards, 
say boards numbered {2,3,4} or only board {1} or nothing but not boards {2,4,5}.
 */
class Solution {
    static long minTime(int[] arr, int n, int k) {
        // code here
        long max = 0, e = 0, s = 0, ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            e = e + arr[i];
        }

        if (n <= k) {
            return max;
        }
        while (s <= e) {
            long mid = s + (e - s) / 2;
            if (isPossibleSolution(arr, mid, k)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isPossibleSolution(int[] arr, long mid, int k) {
        int totalBoard = 0, count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid) {
                return false;
            }
            if (arr[i] + totalBoard > mid) {
                count++;
                totalBoard = arr[i];
                if (count > k) {
                    return false;
                }
            } else {
                totalBoard += arr[i];
            }

        }
        return true;
    }
}
