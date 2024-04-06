import java.util.*;
public class validParenthesis {
    public String minRemoveToMakeValid(String s) {
        StringBuilder ans=new StringBuilder();
        int n=s.length();
        int open=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                open++;
                ans.append(s.charAt(i));
            }else if(s.charAt(i)==')'){
                if(open>0){
                    ans.append(s.charAt(i));
                    open--;
                }else{
                    continue;
                }
            }else{
                ans.append(s.charAt(i));
            }
        }
        n=ans.length();
        for(int i=n-1;i>=0;i--){
            if(ans.charAt(i)=='(' && open!=0){
                ans.deleteCharAt(i);
                open--;
            }
        }
        return ans.toString();
    }
}
