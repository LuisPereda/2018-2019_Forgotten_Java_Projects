import java.util.*;

public class EquationOfALine {


    public static void main(String[] args) {
      
        double a;
        double b;
        double c;
        
        Scanner keyboard = new Scanner(System.in);  
        
        System.out.println("Enter a number for A ");
        a = keyboard.nextDouble();
        
        System.out.println("Enter a number for B ");
        b = keyboard.nextDouble();
        
        System.out.println("Enter a number for C ");
        c = keyboard.nextDouble();
        
        
        // Roots calculator
        
        double result = Math.sqrt(b * b - 4 * a * c);
        
        double root = ( -b + result) / (2*a);
        
        double root1 = ( -b - result) / (2*a);
        
        System.out.println("The roots are " + (root) + " and " + (root1));
        
        
        System.exit(0);
               
        
        
        
    }
    
}
