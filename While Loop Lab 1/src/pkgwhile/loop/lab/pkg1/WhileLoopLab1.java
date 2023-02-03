
package pkgwhile.loop.lab.pkg1;

import java.util.Scanner;


public class WhileLoopLab1 {


    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);  // Data Reader 
        
        int x;
        
        System.out.println("Enter a positive number");
        x = keyboard.nextInt();
        
        if (x<0){
           System.exit(0);
            

    }
        else if (x>0){
            System.out.println("Your answer is " +x);
        }
}
}

     
        

        
       
    
