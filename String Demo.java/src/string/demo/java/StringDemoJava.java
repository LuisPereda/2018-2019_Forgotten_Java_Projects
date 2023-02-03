/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.demo.java;

import java.util.*;

public class StringDemoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // This program demonstrates string commands
     // Written Sept 8, 2017
     long stringlength;
     char stringchar;
     String UpString;
     String LowString;
     String name;
     long number1,number2;
     Scanner keyboard = new Scanner(System.in);
     System.out.println("What is your name?");
     name = keyboard.nextLine();
     
     stringlength = name.length();
     System.out.println("Length = "+stringlength); // Shows how many characters (numbers) in a number or name
     UpString = name.toUpperCase();          // Turns letters into upper case
     System.out.println("upper case = "+UpString);
     System.out.println("Character 9 is"+name.charAt(9)); //The number in the parenthesis show a specific letter or number
     
     System.out.println("Enter a number");
     number1 = keyboard.nextLong();
     System.out.println("Enter a number");
     number2 = keyboard.nextLong();
     System.out.println("You enter " + number1 + " and " + number2);
     
     
     System.exit(0);
     
     
    }
    
}
