//Find the first misiing element here numbers are sorted and implimented using binary search.
public class FindSmallestMissing {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9};
        System.out.println(findMissing(arr, 0,arr.length ,-1));
    }
    public static int findMissing(int[] arr,int s,int e,int ans)
    {
        int mid=s+(e-s)/2;
        if(s<e)
        {
            if(arr[mid]!=mid+1)
            {
                ans=mid+1;
               return findMissing(arr, s, mid, ans);

            }
            else
            {
                return findMissing(arr, mid+1, e, ans);
            }
        }
        return ans;
    }
}
