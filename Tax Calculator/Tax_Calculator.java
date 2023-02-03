import java.util.Scanner;

public class Tax_Calculator {   

   
    public static void main(String[] args) {
        
        
        // Circuit Board Profit
      
        Scanner keyboard = new Scanner(System.in);  // Data Reader
        double CBoard;    // Circuit Board
        double RPrice = .04; // Tax
       
        
        System.out.println("This program calculates after tax price of a circuit board "); // Output
        System.out.println("Enter the price of the circuit board");  // Input
        
        CBoard = keyboard.nextDouble(); // reads the data
        
        double taxes = (CBoard * RPrice);   // State Tax
        double total = (CBoard+(CBoard * RPrice));   // Total + Tax

        
        System.out.println("Sales Tax Calculation"+RPrice);
        System.out.println("Taxes are");   // Output
        System.out.println(("$")+ taxes);  // Output
        System.out.println(("Total amonut after tax: "+"$")+ total);  // Output
        
        
         System.exit(0);  // Ends Program
        
        
        
        
            
    }
    
}