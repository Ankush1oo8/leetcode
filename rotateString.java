public class rotateString {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
      String sDouble=s+s;
      return sDouble.contains(goal);
    }
}
