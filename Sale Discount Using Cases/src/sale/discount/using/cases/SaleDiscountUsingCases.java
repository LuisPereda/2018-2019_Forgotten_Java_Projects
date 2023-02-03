
package sale.discount.using.cases;

import java.util.Scanner;


public class SaleDiscountUsingCases {


    public static void main(String[] args) {
        
        
                Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("The following items are on sale buy one of these and receive a discount or gift");
        System.out.println("iphone8, Laptop, ipad or airpod");
        String str = keyboard.next();
   
        
        switch (str) {
            
            case "iphone8":
                System.out.println("With this purchase you get another iphone8");
        
                break;
                
            
            case "Laptop":
                System.out.println("With this purchase you get $200 discount");
   
                break;
                
                
             case "ipad":
                System.out.println("With this purchase you get $100 discount");
              
                break;   
                
                
             case "airpod":
                System.out.println("With this purchase you get $20 discount");
           
                break;   
                
                
                
             default:
                System.out.println("Imput no recognized");
                System.out.println("Start over");
                break;   
                
                
        }
        
        
        
        
        
        
    }
    
}
        
        
        
        
      