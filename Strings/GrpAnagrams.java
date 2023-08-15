//Leetcode :- Group Anagrams 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        ArrayList<List<String>> res=new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            if(map.get(s)==null)
            {
                ArrayList<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(s,list);
            }
            else
            {
                ArrayList<String> list=(ArrayList)map.get(s);
                list.add(strs[i]);
                map.put(s,list);
            }
        }
        for(String key:map.keySet())
        {
            res.add(map.get(key));
        }
        return res;
    }
}