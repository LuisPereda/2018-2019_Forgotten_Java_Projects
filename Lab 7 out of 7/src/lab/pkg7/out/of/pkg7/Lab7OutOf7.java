package lab.pkg7.out.of.pkg7;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Lab7OutOf7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int x;
        
        while (true){
        
        System.out.println("Enter a number to cube root");
        x = keyboard.nextInt();
        
        int y = x * x * x;
        
        System.out.println("Your number is " +y);
        
        
    }
    
}
}