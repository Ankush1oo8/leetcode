import java.util.Arrays;
import java.util.HashSet;

public class countVowelsStrinRanges {

    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int prefix[] = new int[n];
        prefix[0] = isVowel(words[0]);
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + isVowel(words[i]);
        }
        int m = queries.length;
        int ans[] = new int[m];

        for (int i = 0; i < m; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int res = prefix[r];
            if (l != 0) {
                res -= prefix[l - 1];
            }
            ans[i] = res;
        }
        return ans;
    }

    private int isVowel(String word) {
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        if (set.contains(first) && set.contains(last))
            return 1;
        return 0;
    }
}
