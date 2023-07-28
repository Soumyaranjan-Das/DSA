//GFG :- Given an array arr[] of size n, find the first repeating element. 
//The element should occur more than once and the index of its first occurrence should be the smallest.
import java.util.HashMap;
public class FirstRepeating {
        // Function to return the position of the first repeating element.
        public static int firstRepeated(int[] arr, int n) {
            // Your code here
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                if(map.containsKey(arr[i]))
                {
                    map.put(arr[i],map.get(arr[i])+1);
                }
                else
                {
                    map.put(arr[i],1);
                }
            }
            for(int i=0;i<n;i++)
            {
                if(map.get(arr[i])>1)
                {
                    return i+1;
                }
            }
            return -1;
        }
    }