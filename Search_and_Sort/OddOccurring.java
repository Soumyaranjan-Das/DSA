//Find the odd appearing element in O(Log n) time - GeeksforGeeks
/* Given an array where all elements appear even number of times except one.
 All repeating occurrences of elements appear in pairs and 
 these pairs are not adjacent (there cannot be more than two consecutive occurrences of any element). 
 Find the element that appears odd number of times.*/
public class OddOccurring {
    public static void main(String[] args) {
        int arr1[] = { 1, 1, 2, 2, 1, 1, 2, 2, 13, 1, 1, 40, 40, 13, 13 };
        int arr2[] = { 1, 1, 2, 2, 3, 3, 4, 4, 3, 600, 600, 4, 4 };
        System.out.println(find(arr2));
    }

    public static int find(int[] arr) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (s == e) {
                return arr[s];
            }
            if (mid % 2 == 0) {
                if (mid+1< arr.length && arr[mid + 1] == arr[mid]) {
                    s = mid + 2;
                } else {
                    e = mid;
                }
            }
            else{
                if(mid-1>=0 && arr[mid]==arr[mid-1])
                {
                    s=mid+1;
                }
                else{
                    e=mid;
                }
            }

        }
        return -1;
    }
}
