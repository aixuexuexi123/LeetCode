import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Author: Mr.Yue
 */
public class LC56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        // Sort by ascending starting point
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty()||merged.getLast()[1]<interval[1]){
                merged.add(interval);
            }
            else {
                int max = Math.max(merged.getLast()[1], interval[1]);
                merged.getLast()[1]=max;
            }
        }
         return merged.toArray(new int[merged.size()][]);

    }
}
