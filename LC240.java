/**
 * @Author: Mr.Yue
 */
public class LC240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==target) return true;

                if (matrix[i][j]>target)  break;
            }
        }
        return false;
    }
}
