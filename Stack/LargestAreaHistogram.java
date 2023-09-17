//Leetcode :- Largest Reactangular Area of a Histogram

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] LeftSmaller=leftSmaller(heights);
        int[] RightSmaller= rightSmaller(heights);
        int maxArea=0;
        for(int i=0;i<n;i++)
        {
            int area=heights[i]*(RightSmaller[i]-LeftSmaller[i]-1);
            maxArea=area>maxArea?area:maxArea;
        }
        return maxArea;
    }
    public static int[] leftSmaller(int[] heights)
    {
        int n= heights.length;
        Stack<Integer> st=new Stack<>();
        int[] arr=new int[n];
        st.push(-1);
        for(int i=0;i<n;i++)
        {
                while(st.peek()!=-1 && heights[st.peek()]>=heights[i])
                {
                    st.pop();
                }
               arr[i]=st.peek();
               st.push(i);
        }
        return arr;
    }
    public static int[] rightSmaller(int[] heights)
    {
        int n= heights.length;
        Stack<Integer> st=new Stack<>();
        int[] arr=new int[n];
        st.push(n);
        for(int i=n-1;i>=0;i--)
        {
                while(st.peek()!=n && heights[st.peek()]>=heights[i])
                {
                    st.pop();
                }
                arr[i]=st.peek();
                st.push(i);
        }
        return arr;
    }
}
