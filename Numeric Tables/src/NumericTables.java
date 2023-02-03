import java.util.Scanner;
import javax.swing.JOptionPane;
/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/

public class NumericTables {


    public static void main(String[] args) {

Scanner keyboard = new Scanner(System.in);   // Data Reader
      // TASK #2 Create a Scanner object here
      // (not used for alternate)

      // Identifier declarations
      final int NUMBER = 2 ;        // Number of scores
      final int SCORE1 = 100;       // First test score
      final int SCORE2 = 95;        // Second test score
      final int BOILING_IN_F = 100; // Boiling temperature
      int fToC;                     // Temperature Celsius
      double average;             // Arithmetic average
      String firstName;           //First name
      String lastName;              // Last name
      double diameter;              // Sphere Diameter
      double pie = 3.14;            // Pie in Deciaml Form

      // Interger
      // Double
      // String

      // Find an arithmetic average.
      System.out.println("This program finds the average of two scores.");
      average = (SCORE1 + SCORE2) / NUMBER;
      System.out.println(SCORE1 + " and " + SCORE2 +
               " have an average of " + average + "\n\n");
      
      // Convert Fahrenheit temperature to Celsius.
      System.out.println("This program convert's Fahrenheit temperature to Celsius.");
      fToC = (BOILING_IN_F - 32) * 5/9 ;
      System.out.println(BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius.");

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #2 HERE
       System.out.println("Enter your first name"); 
       firstName = keyboard.nextLine();
       System.out.println("Enter your Last name"); 
       lastName = keyboard.nextLine();
      // Concatenate the user's first and last names
       System.out.println("Your name is " +firstName + " " + lastName);

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #3 HERE
      
      // Get the first character from the user's first name
      System.out.println("The initail of your first name is" + " " + firstName.charAt(0));   // Prompt
   
     // Print out the user's first initial
     System.out.println(firstName.charAt(0));  // Input
     // Convert the user's full name to uppercase
      firstName = firstName.toUpperCase();// Upper Case Converter
      lastName = lastName.toUpperCase();// Upper Case Converter
      // Print out the user's full name in uppercase
      System.out.println("Your full name converted to uppercase is " + firstName.toUpperCase() + " " + lastName.toUpperCase());

      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #4 HERE
      // Prompt the user for a diameter of a sphere 
      System.out.println("This program can find the volume of a sphere");
      System.out.println("Enter the diameter of the sphere");
     // Read the diameter
      diameter = keyboard.nextDouble();
      // Calculate the radius
      double radius = diameter / 2;
      System.out.println("The radius of the sphere is " + radius);
      // Calculate the volume
      double volume = (pie * radius * radius * radius) * 4/3;
      // Print out the volume
      System.out.println("The volume of the sphere is " + volume );
      
      System.exit(0);
      
   }
}
        
        
        
        
        
        
    
    

