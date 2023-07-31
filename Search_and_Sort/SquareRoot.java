//GFG :- Find the flooral value of square root of number
//IMmplented using binary search;
class Solution {
    long floorSqrt(long x) {
        // Your code here
        long s = 1, e = x;
        long ans = -1;
        while (s <= e) {
            long mid = s + (e - s) / 2;

            if (mid * mid <= x) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
}