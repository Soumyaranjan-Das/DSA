//LeetCode := Combination Sum


class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        solve(ans,list,candidates,target,0);
        return ans;
    }
    public static void solve(ArrayList<List<Integer>> ans, ArrayList<Integer> list,int[] candidates,int target,int i)
    {
        if(target<0)
        {
            return;
        }
        if(target==0)
        {
            ans.add(list);
            return;
        }
        for(;i<candidates.length;i++)
        {
           list.add(candidates[i]);
            solve(ans,new ArrayList(list),candidates,target-candidates[i],i);
            list.remove(list.size()-1);
        }
    }
}