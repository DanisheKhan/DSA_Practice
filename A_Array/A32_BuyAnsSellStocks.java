public class A32_BuyAnsSellStocks {
  public static int BuyAndSellStocks(int[] price) {
    int buyPrice = Integer.MAX_VALUE;
    int maxProfite = 0;
    for (int i = 0; i < price.length; i++) {
      if (buyPrice < price[i]) {
        int profite = price[i] - buyPrice;
        maxProfite = Math.max(maxProfite, profite);
      } else {
        buyPrice = price[i];
      }
    }
    return maxProfite;
  }

  public static void main(String[] args) {
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    System.out.println(BuyAndSellStocks(prices));
  }
}
