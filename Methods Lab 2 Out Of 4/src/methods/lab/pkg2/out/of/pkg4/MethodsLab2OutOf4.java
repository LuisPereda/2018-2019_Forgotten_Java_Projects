/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods.lab.pkg2.out.of.pkg4;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class MethodsLab2OutOf4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      
        
     
       
        
       ThePowerOf();      

  
   }

    
    
   public static void ThePowerOf()
   {
       
       Scanner keyboard = new Scanner(System.in);
       
      int cubeSide;
      
      
      System.out.println("Enter a number that you want to raise to the third power:");
      cubeSide = keyboard.nextInt();
      
      int cubeVolume = cubeSide * cubeSide * cubeSide;
      
      
     
     
     System.out.println("This is the second method");
     
     System.out.println("Your number raised to the third power is: " + cubeVolume);

     
     
   }
}
   
   

   
   


