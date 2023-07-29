//LeetCode :- Given an m x n matrix, return all elements of the matrix in spiral order.

import java.util.ArrayList;
import java.util.List;
class PrintSpiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        int rowStart=0,rowEnd=matrix.length,colStart=0,colEnd=matrix[0].length;
        int count=rowEnd*colEnd,i=0;
        while(i<count)
        {
            for(int j=colStart;j<colEnd && i<count;j++)
            {
                list.add(matrix[rowStart][j]);
                i++;
            }
            rowStart++;
            for(int j=rowStart;j<rowEnd  && i<count;j++)
            {
                list.add(matrix[j][colEnd-1]);
                 i++;
            }
            colEnd--;
            for(int j=colEnd-1;j>=colStart  && i<count;j--)
            {
                list.add(matrix[rowEnd-1][j]);
                 i++;
            }
            rowEnd--;
            for(int j=rowEnd-1;j>=rowStart  && i<count;j--)
            {
                list.add(matrix[j][colStart]);
                 i++;
            }
            colStart++;
        }
        return list;
    }
}
