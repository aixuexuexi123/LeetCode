import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Mr.Yue
 */
public class LC54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new ArrayList<Integer>();
       int l=0; int r=matrix.length-1;  int  t=0;  int b=matrix[0].length-1; int x=0;
    Integer []res=   new Integer [(r+1)*(b+1)];
     while (true){
         for (int i = l; i <= r; i++)   res[x++]=matrix[t][i];
         if(++t>b) break;

         for (int i = t; i <=b; i++)   res[x++]=matrix[i][r];
         if(l>--r) break;
         for (int i = r; i >=l; i--)   res[x++]=matrix[b][i];
         if(t>--b) break;
         for (int i = b; i >=t; i--)   res[x++]=matrix[i][l];
         if(l>--r) break;
     }
        return Arrays.asList(res);
    }
}
