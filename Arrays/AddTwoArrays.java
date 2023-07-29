//GFG :- Given two numbers represented by two different arrays A and B. The task is to find the sum array.
//The sum array is an array representation of addition of two input arrays.

import java.util.*;
public class AddTwoArrays {
    ArrayList<Integer> findSum(int a[], int b[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int carry = (a[a.length - 1] + b[b.length - 1]) / 10;
        list.add((a[a.length - 1] + b[b.length - 1]) % 10);
        int i = a.length - 2, j = b.length - 2;
        while (i >= 0 && j >= 0) {
            int temp = a[i] + b[j] + carry;
            list.add(temp % 10);
            carry = temp / 10;
            i--;
            j--;
        }
        while (i >= 0) {
            int temp = a[i] + carry;
            list.add(temp % 10);
            carry = temp / 10;
            i--;
        }
        while (j >= 0) {
            int temp = b[j] + carry;
            list.add(temp % 10);
            carry = temp / 10;
            j--;
        }
        if (carry != 0) {
            list.add(carry);
        }
        Collections.reverse(list);
        return list;
    }
}
