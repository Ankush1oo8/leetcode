public class subTheProductAndSumofDigit {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        String strN = Integer.toString(n);
    for (char c : strN.toCharArray()) {
        
        int digit = c - '0';
        sum += digit;
        product *= digit;
    }
        return product-sum;
    }
}
