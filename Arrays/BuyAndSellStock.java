package Arrays;

public class BuyAndSellStock {

     public static int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE;
        int Profit=0;
        for(int i=0;i<prices.length;i++){
          if(prices[i]<buy){
            buy=prices[i];
          }else{
            Profit=Math.max(Profit, prices[i]-buy);
          }
        }
        return Profit;
    }

    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        
        System.out.println(maxProfit(prices));
    }
}
