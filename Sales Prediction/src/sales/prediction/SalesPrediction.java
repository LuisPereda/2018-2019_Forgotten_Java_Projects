
package sales.prediction;

// Written by Luis Pereda

public class SalesPrediction {   //HW0910LPProb5

 
    public static void main(String[] args) {
       
        // Sales Predicition
        
        
        double percentGenerated = 0.62;
        double Sales = 4600000;
        
        System.out.println("This program will predict how much the East Coast division will generate \n" + " if the company has 4.6 billion dollars in sales this year.");
    
    double Total = (Sales * percentGenerated);
    
    System.out.println("The company will generate");
    System.out.println("$" + Total);
    
    
    System.exit(0); // Ends Program
    
    
    
    }
    
}
