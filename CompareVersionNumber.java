public class CompareVersionNumber {
    public int compareVersion(String version1, String version2) {
        int len1 = version1.length();
        int len2 = version2.length();
    
        int p1 = 0, p2 = 0;
        while (p1 < len1 || p2 < len2) {
            int num1 = 0, num2 = 0;
            while (p1 < len1 && version1.charAt(p1)!= '.') {
                num1 = (num1 * 10) + (version1.charAt(p1) - '0');
                p1++;
            }
    
            while (p2 < len2 && version2.charAt(p2)!= '.') {
                num2 = (num2 * 10) + (version2.charAt(p2) - '0');
                p2++;
            }
    
            // Compare the current parts of both versions
            if (num1 < num2) {
                return -1;
            } else if (num1 > num2) {
                return 1;
            }
    
            // Move to the next part of both versions
            p1++;
            p2++;
        }
    
        // If we reach here, it means both versions are equal up to the last part
        return 0;
    }
    
}
