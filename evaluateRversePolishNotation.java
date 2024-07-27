import java.util.Stack;

class evaluateRversePolishNotation{
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        for(String token : tokens){
            if("+".equals(token)){
                st.push(st.pop()+st.pop());
            }else if("-".equals(token)){
                int f=st.pop();
                int s=st.pop();
                st.push(s-f);
            }else if("*".equals(token)){
                st.push(st.pop()*st.pop());
            }else if("/".equals(token)){
                int divisor = st.pop();
                int dividend = st.pop();
                st.push(dividend / divisor); 
            }else{
                st.push((Integer.parseInt(token)));
            }
        }
        return st.pop();
    }
}