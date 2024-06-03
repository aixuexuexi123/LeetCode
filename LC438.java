import java.util.*;

/**
 * @Author: Mr.Yue
 */
public class LC438 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) {
            return result;
        }

        int[] hash = new int[256]; //character hash
        for (char c : p.toCharArray()) {
            hash[c]++;
        }
        //two pointers, initialize count to p's length
        int left = 0, right = 0, count = p.length();

        while (right < s.length()) {

            if (hash[s.charAt(right++)]-- >= 1) {
                count--;
            }


            if (count == 0) {
                result.add(left);
            }
            if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) {
                count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> res = findAnagrams("abab", "ab");
        System.out.println(res);
    }
}
