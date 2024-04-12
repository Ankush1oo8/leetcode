public class reverseWord {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        String str = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].length() == 0) {
                continue;
            } else {
                if (str.length() == 0) {
                    str = str + arr[i];
                } else {
                    str = str + " " + arr[i];
                }
            }
        }
        return str;
    }
}
