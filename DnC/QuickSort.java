import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={1,8,9,2,15,6,4,7};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quicksort(int[] arr,int s,int e)
    {
       if(s<e)
       {
        int mid=partition(arr,s,e);
        quicksort(arr,s,mid-1);
        quicksort(arr,mid+1,e);
       }
    }
    public static int partition(int[] arr,int s,int e)
    {
        int i=s,j=s+1;
        int pivot=s;
        while(j<=e)
        {
            if(arr[j]<arr[pivot])
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;
        }
       int temp=arr[i];
       arr[i]=arr[pivot];
       arr[pivot]=temp;
       return i;
    }
}
