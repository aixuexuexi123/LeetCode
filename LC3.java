/**
 * @Author: Mr.Yue
 */
public class LC3 {
    public static int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        int res = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            start = Math.max(start, last[s.charAt(i)]);
            res = Math.max(res, i - start + 1);
            last[s.charAt(i)] = i + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int res = lengthOfLongestSubstring("abcabcbb");
        System.out.println(res);

    }
}
