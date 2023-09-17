import java.util.Arrays;

class MergeSort
{
    public static void main(String[] args) {
        int[] arr={5,1,8,9,2,6,4,7};
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesort(int[] arr,int s,int e)
    {
        int mid=s+(e-s)/2;
        if(s<e)
        {
            mergesort(arr, s, mid);
            mergesort(arr,mid+1,e);
            merge(arr,s,e);
        }
    }
    public static void merge(int[] arr,int s,int e)
    {
        int mid=s+(e-s)/2;
        int n1=mid-s+1;
        int n2=e-mid;
        int[] first=new int[n1];
        int[] second=new int[n2];
        for(int k=0;k<n1;k++)
        {
            first[k]=arr[s+k];
        }
        for(int k=0;k<n2;k++)
        {
            second[k]=arr[mid+k+1];
        }
        int i=0,j=0;
        while(i<n1 && j<n2)
        {
            if(first[i]<second[j])
            {
                arr[s++]=first[i++];
            }
            else
            {
                arr[s++]=second[j++];
            }
        }
        while(i<n1)
        {
            arr[s++]=first[i++];
        }
        while(j<n2)
        {
            arr[s++]=second[j++];
        }
    }
}