//Find duplicate element in the array
//the array has n elements and contains 1 to n-1 value with one repeated number

class FindDuplicate
{
    public static void main(String[] args) {
        int[] arr={1,4,2,5,3,6,4};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] arr)
    {
        int n=arr.length;
        int i=0;
        while(i<n)
        {
            int index=arr[i];
            if(arr[i]!=arr[index])
            {
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
            else{
                i++;
            }
        }
        return arr[0];
    }
}