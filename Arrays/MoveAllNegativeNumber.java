//program to move all negitive elements of the arry to the left side of the arry
//order not preserved
import java.util.Arrays;
class MoveAllNegativeNumber
{
    public static void main(String[] args)
    {
        int[] arr={2,-3,3,4,-6,-9,8,1,-7};
        moveNegativeLeft(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveNegativeLeft(int[] arr)
    {
        int n=arr.length,i=0,j=n-1;
        while(i<j)
        {
            if(arr[j]>0)
            {
                j--;
            }
            else if(arr[i]<0)
            {
                i++;
            }
            else
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        
    }
}