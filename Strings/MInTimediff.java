//Leetcode :- Minimum time Difference
/*Given a list of 24-hour clock time points in "HH:MM" format, 
return the minimum minutes difference between any two time-points in the list. 
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n=timePoints.size();
        ArrayList<Integer> minutes=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String s=timePoints.get(i);
            int pos=s.indexOf(":");
            minutes.add(Integer.parseInt(s.substring(0,pos))*60 +Integer.parseInt(s.substring(pos+1,s.length())));
        }
        Collections.sort(minutes);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)
        {
            if(minutes.get(i+1)-minutes.get(i)<min)
            {
                min=minutes.get(i+1)-minutes.get(i);
            }
        }
        int lastDiff=minutes.get(0)+1440-minutes.get(n-1);
        return lastDiff<min?lastDiff:min;
    }
}
