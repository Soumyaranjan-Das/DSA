//Given an integer N, find its factorial.
// Return a list of integers denoting the digits that make up the factorial of N.

import java.util.ArrayList;
import java.util.Collections;

public class FactorialLargeNumber {
    static ArrayList<Integer> factorial(int N) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int i = 2, carry = 0;
        while (i <= N) {
            for (int j = 0; j < list.size(); j++) {
                int x = i * list.get(j) + carry;
                list.set(j, x % 10);
                carry = x / 10;
            }
            while (carry != 0) {
                list.add(carry % 10);
                carry /= 10;
            }
            i++;
        }
        Collections.reverse(list);
        return list;
    }
}
