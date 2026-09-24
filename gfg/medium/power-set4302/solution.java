import java.util.*;

class Solution {
    void allSubsequence(String p, String up, List<String> sahi) {
        if (up.length() == 0) {
            sahi.add(p);
            return;
        }
        char ch = up.charAt(0);

   
        allSubsequence(p + ch, up.substring(1), sahi);

        allSubsequence(p, up.substring(1), sahi);
    }

    public List<String> powerSet(String s) {
        List<String> sahi = new ArrayList<>();
        allSubsequence("", s, sahi);
        Collections.sort(sahi);
        return sahi;
    }
}
