
package numbers.definer;

import java.util.Scanner;

public class NumbersDefiner {

   
    public static void main(String[] args) {
        
   
        Scanner keyboard = new Scanner(System.in);
        
        int number;
        
        // request an interger value from the user
        System.out.print("Enter a number: ");
        // store the user data
        number = keyboard.nextInt();
        
        // determine if the number is even or odd
        if( number % 2 == 0)
            System.out.println( number + " is even.\n" );
        else
            System.out.println( number + " is odd.\n" );
        
        System.exit(0);
        
    }
}
        
        
        
        
        
    
    
    
    

