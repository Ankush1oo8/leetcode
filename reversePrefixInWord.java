public class reversePrefixInWord {
    public String reversePrefix(String word, char ch) {
        int j=word.indexOf(ch)+1;
        if(j==-1)return word;
        StringBuilder sb = new StringBuilder(word.substring(0, j));
         sb.reverse();
          sb.append(word.substring(j));
          return sb.toString();
    }
}
