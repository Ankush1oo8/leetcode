public class reduceNumberInBinarytoOne {
    public int numSteps(String s) {
        int n=s.length();
       int opr=n-1;
       int carry=0;
      
       for(int i=n-1;i>=1;i--){
           if((s.charAt(i)-'0'+carry==1)){
               opr++;
               carry=1;
           }
       }
       return opr+carry;
   }
}
