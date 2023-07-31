//program to search an element in a sorted matrix using binary search

public class SearcMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int n=arr.length*arr[0].length-1;
        int ans=find(arr,0,n,4);
        System.out.println("the element is at : "+ans/arr[0].length+"   "+ans%arr[0].length);
    }
    public static int find(int[][] arr,int s,int e,int k)
    {
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            int row=mid/arr[0].length,col=mid%arr[0].length;
            if(arr[row][col]==k)
            {
                return mid;
            }
            if(arr[row][col]<k)
            {
                s=mid+1;
            }
            else
            {
                e=mid;
            }
        }
        return -1;
    }
}
