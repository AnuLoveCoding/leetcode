public class solve {
    public static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE , maxprofit= 0;
        for (int price : prices) {
            if (price < minprice) {
                minprice = price;
            } else if (price - minprice > maxprofit) {
                maxprofit = price - minprice;
            }

        }
        return maxprofit;
    }
    public static void main(String[] args) {

        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
