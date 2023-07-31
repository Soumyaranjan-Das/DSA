//Find an element in nearly sorted array using binary search.
//In nearly sorted array the element can be present in ith ,(i+1)th ,(i-1)th position in the sorted array.

public class SearchNearlySortedArray {
    public static void main(String[] args) {
        int[] arr = { 10, 3, 40, 20, 50, 80, 70 };
        System.out.println(find(arr, 20));
    }

    public static int find(int[] arr, int k) {
        int s = 0, e = arr.length;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == k) {
                return mid + 1;
            }
            if (mid + 1 < arr.length && arr[mid + 1] == k) {
                return mid + 2;
            }
            if (mid - 1 >= 0 && arr[mid - 1] == k) {
                return mid - 2;
            }
            if (arr[mid] < k) {
                s = mid + 2;
            } else {
                e = mid - 2;
            }

        }
        return -1;
    }
}
