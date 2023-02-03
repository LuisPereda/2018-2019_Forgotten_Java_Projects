public class HW0910LPStockTransactionProgram {


    public static void main(String[] args) {
       
          // This program calculates share cost and stock commission
        
        double PurchasedShares = 1000;  // Amount of shares purchased at first
        double StockPrice = 32.87;  // Price of share when the purchase was first made
        double StockSold = 33.92;  // Price of share when the stock was sold
        double FirstCommission = 0.02; // Joe paid his stockbroker 2% commission
        double SecondCommission = 0.02; // Second Commision
        
        System.out.println("This program calculates share cost and stock commission");  // Output
        
        double Total = (PurchasedShares*StockPrice);   // Amount of money Joe paid for the 1000 shares
        double Total1 = (Total * FirstCommission); //  Amount Joe paid for the purchase of 1000 shares + Commission
        double Total2 = (PurchasedShares * StockSold);  // Amount of money Joe sold the stock for
        double Total3 = (Total2 * SecondCommission); // Amount Joe paid for the selling of 1000 shares + Commission
        double Total4 = (Total - Total1);
        double Total5 = (Total2 - Total3);
        double Total6 = (Total4 + Total5);
        
        System.out.println("When Joe bought 1000 shares at $32.87 he spend");   // Output
        System.out.println(("$")+ Total);   // Amount of money Joe paid for the 1000 shares
        System.out.println("The total amount of commission joe paid to his stockbroker after buying the 1000 shares was");   // Output
        System.out.println(("$")+ Total1);   // Amount Joe paid for the purchase of 1000 shares + Commission
        System.out.println("When Joe sold the 1000 shares at $33.92 he made ");   // Output
        System.out.println(("$")+ Total2);   //  // Amount of money Joe sold the stock for
        System.out.println("The total amount of the second commission joe had paid to his stockbroker after selling the 1000 shares was");   // Output
        System.out.println(("$")+ Total3);    // Amount Joe paid for the selling of 1000 shares + Commission
        System.out.println("The total amount of profit Joe made after selling his stock and paying the two commissions to his stockbroker was"); 
        System.out.println(("$")+ Total6);
         
        System.exit(0);  // Ends Program
         }
    
}
