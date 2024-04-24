class tibonacciNumber{
    public int tribonacci(int n) {
        if(n<=2){
            return (n==0)?0: 1;
        }
        int pre=0;
        int prev=1;
        int prevv=1;
        int sum=0;
        for(int i=3;i<=n;i++){
            sum=prevv+pre+prev;
            pre=prev;
            prev=prevv;
            prevv=sum;
        }
        return sum;
    }
}