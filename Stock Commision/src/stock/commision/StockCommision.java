
package stock.commision;

import java.util.Scanner;

// Written by Luis Pereda

public class StockCommision {    //HW0910LPProb15

  
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);   // Data Reader
        double shares;  // # of shares
        double stockPrice;   // Stock Price
        double percent;   // Commision
        
        
        System.out.println("This program calculates stock price, commission and total amount paid");  // Output
        System.out.println("Enter the amount of shares");  // Prompt
        shares = keyboard.nextDouble(); // reads the data
        System.out.println("Enter the amount paid for a single share ");   // Prompt
        stockPrice = keyboard.nextDouble(); // reads the data
        System.out.println("Enter the comission that needs to be paid");   // Prompt
        percent = keyboard.nextDouble(); // reads the data
        
        
        
        double Total = (shares);   // State Tax
        double Total1 = (shares * stockPrice); // County Tax
        double Total2 = (Total1 / percent );  // Total Sales Tax
        double Total3 = (Total1 + Total2); // Total + Sales Tax
        System.out.println("This is how much you pay without the commission");   // Outpu
        System.out.println(("$")+ Total1);   // Outpu
        System.out.println("This is how much commission you will be paying");   // Outpu
        System.out.println(("$")+ Total2);  // Outpu
        System.out.println("This is your total plus the comission");   // Outpu
        System.out.println(("$")+ Total3);  // Outpu
        
        System.exit(0);
        
    }
    
}
