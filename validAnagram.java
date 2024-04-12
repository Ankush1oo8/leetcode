import java.util.*;

public class validAnagram {
    public boolean isAnagram(String s, String t) {
        // Check if the lengths of the strings are equal
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare the sorted character arrays
        return Arrays.equals(sArray, tArray);
    }
}
