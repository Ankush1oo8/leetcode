import java.util.Stack;

public class validparenthesis3 {
    
    //passed 90 test cases
    // public boolean isValid(String s) {
    //     int cBracket=0;
    //     int qBracket=0;
    //     int sBracket=0;
    //     for(int i=0;i<s.length();i++){
    //         if(s.charAt(i)=='(') cBracket++;
    //         if(s.charAt(i)=='{') qBracket++;
    //         if(s.charAt(i)=='[') sBracket++;
    //         if(s.charAt(i)==')') cBracket--;
    //         if(s.charAt(i)=='}') qBracket--;
    //         if(s.charAt(i)==']') sBracket--;
    //     }
    //     if(cBracket!=0 || qBracket!=0 || sBracket!=0) return false;
    //     return true;
    // }
      public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else {
            if (stack.isEmpty()) {
                return false; // No matching opening bracket
            }
            char top = stack.peek(); // Peek at the top of the stack without popping
            if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                stack.pop(); // Pop the stack only if there's a matching pair
            } else {
                return false; // Mismatched brackets
            }
        }
    }
    return stack.isEmpty(); // If stack is empty, all brackets are correctly matched
}
}
