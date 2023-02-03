
package ingredient.adjuster;

import java.util.Scanner;

// Written by Luis Pereda

public class IngredientAdjuster {    //HW0910LPProb17

   
    public static void main(String[] args) {
        
      Scanner keyboard = new Scanner(System.in);
     double Cookies;  // Amount of Cookies
     double BagOfCookies = 48;   // One Bag of Cookies
     double Sugar = 1.5;  //  Set Amount of Sugar for 48 Cookies
     double Butter = 1;  // Set Amount of Butter for 48 Cookies
     double Flour = 2.75;  // Set Amount of Flour for 48 Cookies
     
     System.out.println("Enter the amount of cookies that you want to make");   // Prompt
      Cookies = keyboard.nextDouble(); // reads the data
     
     System.out.println("This program calculates neccesary ingredients to make\n" +" a specific amount of cookies");  // Output
        
     double total = (Sugar / BagOfCookies);   // Amount for one Cookie
     double total1 = (Butter / BagOfCookies);  // Amount for one Cookie
     double total2 = (Flour / BagOfCookies);  // Amount for one Cookie
     double total3 = (total * Cookies);    // Conversion
     double total4 = (total1 * Cookies);   // Conversion
     double total5 = (total2 * Cookies);   // Conversion
     
     
     System.out.println("These are the amount of ingredients needed to make this many cookies");  // Output
     
     System.out.println("The amount of sugar needed is");    // Output
     System.out.println(total3 + (" Grams"));   // Output
     System.out.println("The amount of Butter needed is");   // Output
     System.out.println(total4 + (" Grams"));   // Output
     System.out.println("The amont of flour needed is");   // Output
     System.out.println(total5 + (" Grams"));   // Output
     
     System.exit(0);
     
    }
    
}
