//GFG :- Sort a Stack

class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		solve(s);
		return s;
	}
	public static void solve(Stack<Integer> s)
	{
	    if(s.empty())
	    {
	        return;
	    }
	    int element= s.pop();
	   solve(s);
	   insert(s,element);
	}
	public static void insert(Stack<Integer> s,int e)
	{
	    if(s.empty() || s.peek()<e)
	    {
	        s.push(e);
	        return;
	    }
	    int val=s.pop();
	    insert(s,e);
	    s.push(val);
	    
	}
	
}
