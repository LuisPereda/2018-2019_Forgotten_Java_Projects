/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg1.out.of.pkg7;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Lab1OutOf7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner keyboard = new Scanner(System.in);  // Data Reader 
       
               int x;
        
               while (true){
               
        System.out.println("Enter a positive number");
        x = keyboard.nextInt();
               
        
        if (x<0){
            System.out.println("Program ended");
           System.exit(0);
        }
        
         else if (x>0){
             System.out.println("Your answer is " +x);
        }
                            }
                                                }

                         }

        
