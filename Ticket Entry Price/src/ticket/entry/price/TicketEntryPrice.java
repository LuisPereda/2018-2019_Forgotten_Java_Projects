
package ticket.entry.price;

import java.util.*;



public class TicketEntryPrice {

   
    public static void main(String[] args) {
        
      
        
        int age;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter age");
        age = keyboard.nextInt();// read the data 
        
       
        
        if(age <=5)
        
        System.out.println("Free");
        
            else if(age <=13)
        System.out.println("Children from ages 5-12 pay 13 dollars");
        
            else if (age <=55)
        System.out.println("Adults from 13 to 55 pay 18 dollars");
        
            else System.out.println("13 dollars");
      
            
        System.exit(0);
        
    }
    
}




