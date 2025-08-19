public class Solution{
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println( "Maximum Profit : " + result);
    }
    public static int maxProfit(int[] prices){
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int price : prices){
            if(price < minprice){
              minprice = price;
            }
            else if(price - minprice > maxprofit){
                maxprofit = price - minprice;
            }
        }
        return maxprofit;
    }
}