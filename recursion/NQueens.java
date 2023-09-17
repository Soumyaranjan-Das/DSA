//LeetCode :- Nqueens Problem

    class Solution {
        public List<List<String>> solveNQueens(int n) {
            ArrayList<List<String>> ans=new ArrayList<>();
            int[][] board=new int[n][n];
            int[] rowCheck=new int[n];
            int[] buttomRightCheck=new int[n*2];
            int[] topLeftCheck=new int[n*2];
    
            solve(board,ans,rowCheck,buttomRightCheck,topLeftCheck,n,0);
            return ans;
        }
        public static void solve(int[][] board, ArrayList<List<String>> ans,int[] rowCheck,int[] buttomRightCheck,int[] topLeftCheck,int n,int col)
        {
           if(col>=n)
           {
               storeResult(board,ans,n);
               return;
           }
           for(int row=0;row<n;row++){
        
           if(isSafe(row,col,n,rowCheck,buttomRightCheck,topLeftCheck))
           {
               rowCheck[row]=1;
               buttomRightCheck[col+row]=1;
               topLeftCheck[n-1+row-col]=1;
               board[row][col]=1;
                solve(board,ans,rowCheck,buttomRightCheck,topLeftCheck,n,col+1);
                board[row][col]=0;
                rowCheck[row]=0;
               buttomRightCheck[col+row]=0;
               topLeftCheck[n-1+row-col]=0;
           }
           }
        }
        public static boolean isSafe(int row,int col,int n,int[] rowCheck,int[] buttomRightcheck,int[] topLeftCheck)
        {
            if(rowCheck[row]==1)
            {
                return false;
            }
            else if(buttomRightcheck[row+col]==1)
            {
                return false;
            }
            else if(topLeftCheck[n-1+row-col]==1)
            {
                return false;
            }
            return true;
        }
        public static void storeResult(int[][] board, ArrayList<List<String>> ans,int n)
        {
            ArrayList<String> list=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                String str="";
                for(int j=0;j<n;j++)
                {
                    if(board[i][j]==1)
                    {
                        str=str+"Q";
                    }
                    else
                    {
                        str=str+".";
                    }
    
                }
                list.add(str);
            }
            ans.add(list);
        }
    }