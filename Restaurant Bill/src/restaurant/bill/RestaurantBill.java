
package restaurant.bill;

import java.util.Scanner;

// Written by Luis Pereda

public class RestaurantBill {   //HW0910LPProb13

    public static void main(String[] args) {
     
        Scanner keyboard = new Scanner(System.in);  // Data Reader
        double mealCharge;   // Meal Cost
        double mealTax = 0.0675; //  Meal Tax
        double mealTip = 0.2;   // Meal Tip
        
        System.out.println("This program calculates the tax and tip that needs to be paid for a meal");  // Output
        System.out.println("Enter the cost of the meal");   // Input
        mealCharge = keyboard.nextInt(); // reads the data
        double Total = (mealCharge);   // Meal Cost
        double Total1 = (mealCharge * mealTax); // Meal Tax
        double Total2 = (mealCharge + Total1); // Meal + Tax + Tip
        double Total3 = (Total2 * mealTip); // Tip
        double Total4 = (Total3 + Total);   
        double Total5 = (Total1 + Total4);// Total
        System.out.println("Meal Charge");   // Output
        System.out.println(("$")+ Total);    // Output
        System.out.println("Meal Tax");      // Output
        System.out.println(("$")+ Total1);   // Output
        System.out.println("Tip");           // Output
        System.out.println(("$")+ Total3);   // Output
        System.out.println("Total");         // Output
        System.out.println(("$")+ Total5);   // Output
        
        
         System.exit(0);        
    }
    
}

