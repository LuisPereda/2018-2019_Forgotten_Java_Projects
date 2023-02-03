
package tax.calculator;

import java.util.*;   // Data Reader

public class TaxCalculator   { //C50906LPprob8

    public static void main(String[] args) {
        // This program calculates state and county tax. Assuming that state tax is 4% and county tax is 2%
        Scanner keyboard = new Scanner(System.in);   // Data Reader
        double Money;  // Money
        double StateTax = 0.04; // State Tax
        double CountyTax = 0.02; //CountyTax
        System.out.println("This program calculates state and county tax");  // Output
        System.out.println("Enter the amount of money that needs to be calculated");  // Prompt
        Money = keyboard.nextDouble(); // reads the data
        double Total = (Money*StateTax);   // State Tax
        double Total1 = (Money*CountyTax); // County Tax
        double Total2 = (Total + Total1 );  // Total Sales Tax
        double Total3 = (Money + Total2); // Total + Sales Tax
        System.out.println("State tax");   // Output
        System.out.println(("$")+ Total);   // Output
        System.out.println("County tax");   // Output
        System.out.println(("$")+ Total1);   // Output
        System.out.println("Total Sales tax");   // Output
        System.out.println(("$")+ Total2);   // Output
        System.out.println("Total");   // Output
        System.out.println(("$")+ Total3);    // Output
        
        
         System.exit(0);  // Ends Program
        
        
        
        
            
    }
    
}
