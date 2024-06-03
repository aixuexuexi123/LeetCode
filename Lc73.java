import java.util.HashSet;

/**
 * @Author: Mr.Yue
 */
public class Lc73 {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> x_index = new HashSet<>();
        HashSet<Integer> y_index = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0) {
                    x_index.add(i);
                    y_index.add(j);
                    }
                }
                }
        for (Integer xIndex : x_index) {
            for (int j2 = 0; j2 < matrix[0].length; j2++) {
                matrix[xIndex][j2]=0;
            }

            }
        for (Integer yIndex : y_index) {
            for (int i2 = 0; i2 < matrix.length; i2++) {
                matrix[i2][yIndex]=0;
            }
        }
        }
    }

