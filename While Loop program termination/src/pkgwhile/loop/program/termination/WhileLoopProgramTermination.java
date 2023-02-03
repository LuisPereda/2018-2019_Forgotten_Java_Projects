/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile.loop.program.termination;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class WhileLoopProgramTermination {

  
    public static void main(String[] args) {
        
        
        Scanner keyboard = new Scanner(System.in);  // Data Reader 
       
               int x;
        
               while (true){
               
        System.out.println("Enter a positive number");
        x = keyboard.nextInt();
               
        
        if (x<0){
           System.exit(0);
            

    }
        else if (x>0){
            System.out.println("Your answer is " +x);
        }
}
}}

        
        
    