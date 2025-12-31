public class greedy {

    public static int calcProfit(int[] prices, int min_price, int max_profit ){
      //edge case 
      if(prices== null || prices.length == 0)return 0;
       
      min_price=Integer.MAX_VALUE;
      max_profit=0;

      for(int i=0; i<prices.length;i++){
        if(prices[i]<min_price){
            min_price=prices[i];
        }else if(prices[i]-min_price>max_profit){
            max_profit=prices[i]-min_price;

        }
      }return max_profit;
      
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4,9};
        int min_price=Integer.MAX_VALUE;    
        System.out.println(calcProfit(prices, min_price, 0));
    }
    
}
