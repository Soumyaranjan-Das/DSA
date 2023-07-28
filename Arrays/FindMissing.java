//find the missing elements in the array with out changing the existing array
//array contians n elements the elements can be repeatative from 1 to n  
import java.util.ArrayList;
public class FindMissing {
    public static void main(String[] args) {
        int[] arr ={3,1,5,4,3,3};
        System.out.println("Missing elements are "+findMissing(arr));
    }
    public static ArrayList<Integer> findMissing(int[] arr)
    {   
        int n=arr.length;
        for (int i=0;i<n;i++)
        {
            int index=(arr[i]>0?arr[i]:-arr[i])-1;
            if(arr[index]>0)
            {
                arr[index]=-arr[index];
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                list.add(i+1);
            }
            else{
                arr[i]=-arr[i];
            }
        }
        return list;
    }
}
