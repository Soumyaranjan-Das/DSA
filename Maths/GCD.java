//GFG :- gcd and lcm (Euclid's Algorthim)

//lcm=A*B/gcd;

class Solution {
    public int gcd(int A, int B) {
        if (A == 0)
            return B;
        if (B == 0)
            return A;

        while (A > 0 && B > 0) {
            if (A > B) {
                A = A - B;
            } else {
                B = B - A;
            }
        }
        if (A == 0)
            return B;
        return A;
    }
}