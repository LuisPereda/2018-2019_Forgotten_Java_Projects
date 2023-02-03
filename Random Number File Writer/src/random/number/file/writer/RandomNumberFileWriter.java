/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random.number.file.writer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class RandomNumberFileWriter {

 public static void main(String[] args) throws IOException
   {
      int maxNumbers;              // Max number of random numbers
      int number;                      // To hold a random number
       
Scanner keyboard = new Scanner(System.in);                                 // Create a Scanner object for keyboard input.
      
Random rand = new Random();                               // Create a Random object to generate random numbers.
      
PrintWriter outputFile = new PrintWriter("numbers.txt");       // Create a PrintWriter object to open the file.
      
System.out.print("How many random numbers should I write? ");     // Get the number of random numbers to write.

      maxNumbers = keyboard.nextInt();
      
for (int count = 0; count < maxNumbers; count++)                                 // Write the random numbers to the file.
      {
number = rand.nextInt();                    // Generate a random integer.
         
outputFile.println(number);                      // Write the random integer to the file.
      }
      
outputFile.close();                                        // Close the file.
      System.out.println("Done");
   }
}

        
        

        
