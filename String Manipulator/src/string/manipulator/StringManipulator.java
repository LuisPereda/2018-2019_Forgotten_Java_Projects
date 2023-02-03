
package string.manipulator;

import java.util.Scanner;

// Written by Luis Pereda

public class StringManipulator {   //HW0910LPProb12

    public static void main(String[] args) {
        
        // String Manipulator
        
  // This program demonstrates string commands
     // Written Sept 8, 2017
     long stringlength;  // Input Length
     char stringchar;    // Input First Character
     String UpString;    // Uper Case Converter
     String LowString;   // Lower Case Converter
     String name;       // Input Name
     
     Scanner keyboard = new Scanner(System.in);    // Data Reader
     System.out.println("Enter your favorite city");   // Prompt
     name = keyboard.nextLine();   // Data Reader
     
     stringlength = name.length();    // Character Count
     System.out.println("The number of characters in your favorite city are");  // Output
     System.out.println(stringlength); // Shows how many characters (numbers) in a number or name
     
     UpString = name.toUpperCase();   // Upper Case Converter
     
     LowString = name.toLowerCase();// Turns letters into upper case
     System.out.println("This is your city converted into capital letters");  // Output
     System.out.println(UpString);  // Input
     System.out.println("This is your city converted into lowercase letters");  // Ouput
     System.out.println(LowString);  // Input
     System.out.println("The first letter of your favorite city is ");  // Output
     System.out.println(name.charAt(0));  // Input
     
     System.exit(0);

    }
}