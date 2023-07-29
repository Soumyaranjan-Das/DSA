
//GFG :- Given three arrays sorted in increasing order.
// Find the elements that are common in all three arrays.

import java.util.ArrayList;
import java.util.TreeSet;

public class CommonElements {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
                set.add(A[i]);
                i++;
                j++;
                k++;
            } else if (A[i] < B[j]) {
                i++;
            } else if (B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }
        for (Integer x : set) {
            list.add(x);
        }
        if (list.size() == 0) {
            list.add(-1);
        }
        return list;
    }
}