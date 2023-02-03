
package items.tax.pkgwhile.loop;

import java.util.*; 


public class ItemsTaxWhileLoop {


    public static void main(String[] args) {
        
        double Grade;
        String X;
        
        
        
       Scanner keyboard = new Scanner(System.in);   // Data Reader
       
       System.out.println("Enter a number from 0-120");
       Grade = keyboard.nextDouble();
       
       while (Grade>120)
               
               { 
                   System.out.println("Enter a number from 0-120");
       Grade = keyboard.nextDouble();
       
               }
       
       X=keyboard.nextLine();
       
       
       
       System.exit(0);
       

               
    
}

}
