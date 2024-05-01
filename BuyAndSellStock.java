public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int left=0;
        int right=0;
        int profit=Integer.MIN_VALUE;
       int minPrice = prices[0];
       for(int price:prices){
        profit=Math.max(profit,price-minPrice);
        minPrice=Math.min(minPrice,price);
       }
        return profit;
    }
}
