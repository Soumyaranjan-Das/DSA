import java.util.Scanner;
public class Eko {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(findHeight(arr, k));
    }

    public static int findHeight(int[] arr, int k) {
       
       int s=0,e=arr[0];
       for(int i=1;i<arr.length;i++)
       {
        if(e<arr[i])
        {
            e=arr[i];
        }
       }
        
        int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(isPossibleSolution(arr,mid,k))
            {
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
    public static boolean isPossibleSolution(int[]  arr,int mid,int k)
    {
        int sum=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>mid)
            {
                sum+=arr[i]-mid;
            }
            if(sum>=k)
            {
                return true;
            }
        }
       return false;
    }
}
