
package pkgwhile.loops;

import java.util.*;


public class WhileLoops {

    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        double total,price;
        total = 0;
        System.out.println("What is the price?");
        price = keyboard.nextDouble();
        while(price>=10)
        {
            
            total+=price;
            System.out.println("What is the price?");
            price = keyboard.nextDouble();
            
            
        }
        
        System.out.println(total += price);
        
        System.exit(0);
       
    }
    
}
