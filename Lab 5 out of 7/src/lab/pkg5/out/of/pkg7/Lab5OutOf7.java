/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5.out.of.pkg7;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Lab5OutOf7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);  // Data Reader 
        
           int count = 0, num;
           
           while (true){

           System.out.println("Enter a number");
           num = keyboard.nextInt();
           
        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
}
        
        
}
    