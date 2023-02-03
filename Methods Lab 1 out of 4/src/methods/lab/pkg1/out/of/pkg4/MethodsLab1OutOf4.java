package methods.lab.pkg1.out.of.pkg4;

import java.util.Scanner;


public class MethodsLab1OutOf4 {


    
    
    public static void main(String[] args) {
        
      int number = 50;
        
      System.out.println("Interger = "+number + "    This is the Main Method");
      
       printStars(number);
    
    }

    
        public static void printStars(double changeNumber){
            
            Scanner keyboard = new Scanner(System.in);
            
            System.out.println("Enter a number " + "     This is the Second Method");
            changeNumber = keyboard.nextDouble();
            
            for(changeNumber = changeNumber; 0 < changeNumber; changeNumber --){
                System.out.println("*");
            }
            
           
            
        } 
}            
      


  
   
   


