import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Author: Mr.Yue
 */
public class LC139 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        String str=" ";
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < wordDict.size(); i++) {
            hashSet.add(wordDict.get(i));
        }
        while (true){

            for (int i = 0; i < wordDict.size(); i++) {
                for (String string : hashSet) {
                    if (string.length()>s.length()){
                        return false;
                    }
                    if(hashSet.contains(s.replace(wordDict.get(i),""))){
                        return true;
                    }
                    hashSet.add(string+wordDict.get(i));
                }
            }

        }

    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cats");
        list.add("dog");
        list.add("sand");
        list.add("and");
        list.add("cat");

        System.out.println(wordBreak( "catsandog",list ));
    }

}
