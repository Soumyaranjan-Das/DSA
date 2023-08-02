//GFG :- Book Allocation Problem 
/*
You have N books, each with Ai number of pages. 
M students need to be allocated contiguous books, with each student getting at least one book.
 Out of all the permutations,
the goal is to find the permutation where the student with the most books allocated to him 
gets the minimum number of pages, out of all possible permutations. 
*/

class Solution {
    // Function to find minimum number of pages.
    public static int findPages(int[] arr, int n, int m) {
        // Your code here
        if (n < m) {
            return -1;
        }
        int s = arr[0], e = 0, ans = -1;
        for (int i = 0; i < arr.length; i++) {
            e = e + arr[i];
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isPossibleSolution(arr, mid, m)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;

    }

    public static boolean isPossibleSolution(int[] arr, int mid, int m) {
        int pageSum = 0, count = 1;
        for (int i = 0; i < arr.length;) {
            if (pageSum + arr[i] <= mid) {
                pageSum = pageSum + arr[i];
                i++;
            } else {
                count++;
                pageSum = 0;
            }
            if (count > m) {
                return false;
            }
        }
        return true;
    }
}