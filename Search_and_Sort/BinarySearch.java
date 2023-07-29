//The following programme demostrate the binary search 
//The arry must be sorted and if the searched value not found then the result will be -1
class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 7, 9, 11, 12, 44, 67, 77, 89 };
        System.out.println(search(arr, 0, arr.length - 1, 11));

    }

    public static int search(int[] arr, int start, int end, int k) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                return mid+1;
            }
            if(arr[mid]>k)
            {
                return search(arr,0,mid,k);
            }
            else{
                return search(arr,mid+1,end,k);
            }
        }
        return -1;
    }
}