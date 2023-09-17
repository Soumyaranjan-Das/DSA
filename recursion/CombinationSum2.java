//leetCode :- Combination Sum II

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<List<Integer>> ans=new ArrayList<>();
         ArrayList<Integer> list=new ArrayList<>();
        solve(ans,list,candidates,target,0);
        return ans;
    }
    public static void solve(ArrayList<List<Integer>> ans, ArrayList<Integer> list,int[] candidates,int target,int index)
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
        for(int i=index;i<candidates.length;i++)
        {
            if(i>index && candidates[i]==candidates[i-1])
            {
                continue;
            }
           list.add(candidates[i]);
            solve(ans,new ArrayList(list),candidates,target-candidates[i],i+1);
            list.remove(list.size()-1);
        }
    }
}