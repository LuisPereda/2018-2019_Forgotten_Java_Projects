/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hours.and.pay;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class HoursAndPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Calculate pay from pay = rate times hours
   Scanner keyboard = new Scanner(System.in);
   int hours  ;
   int rate ;
   System.out.println("This program calculates rate and time");
  
   System.out.println("What are the hours ?");
   hours = keyboard.nextInt();// read the data 
   System.out.println("What is the rate ?");
   rate = keyboard.nextInt();

   int Total=(hours*rate);
    System.out.println("The total amount of money earned is");
    System.out.println("$"+Total);
    
    
    System.exit(0);
  }
}


    