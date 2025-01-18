public class minNumberSwaps2MakeStrBalanced {
        public int minSwaps(String s) {
            int open=0;
            int close=0;
        // Stack<Character>stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='['){
                open++;
            }else{
                if(open<=0){
                    close++;
                }else{
                    open--;
                }
            }
        }
        return ((open+1)/2);
        }
    
}
