//Find the 1st occurance of element in a sorted array using binary search.

public class FirstOccurance {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,4,4,4,4,5,5,6,7,8};
        System.out.println(search(arr,0,arr.length-1,4,-1));
    }
    public static int search(int[] arr,int s,int e,int k,int ans)
    {
        if(s<e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==k)
            {
                ans=mid+1;
                e=mid;
            }
            if(arr[mid]<k)
            {
                return search(arr,mid+1,e,k,ans);
            }
            else{
                return search(arr,s,mid,k,ans);
            }
        }
        return ans;
    }
}
