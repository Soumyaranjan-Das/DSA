public class MaxOfArrayRE {
    public static void main(String[] args) {
        int[] arr={5,35,66,132,47,44,97};
        System.out.println(findMax(arr, arr.length-2, arr[arr.length-1]));
    }
    public static int findMax(int[] arr,int n,int max)
    {
        if(n<0)
        {
            return max;
        }
        if(arr[n]>max)
        {
           return findMax(arr, n-1, arr[n]);
        }
        return findMax(arr, n-1, max);
    }
}
