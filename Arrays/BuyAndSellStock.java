package Arrays;

public class BuyAndSellStock {

     public static int maxProfit(int[] prices) {
        int buy=0;
        int sell=0;
        for(int i=0;i<prices.length;i++){
            if(prices[buy]<sell){
                return sell-prices[buy];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        
        System.out.println(maxProfit(prices));
    }
}
