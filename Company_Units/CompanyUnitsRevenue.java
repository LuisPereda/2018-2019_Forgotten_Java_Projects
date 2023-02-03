import java.util.Scanner;

public class CompanyUnits {


    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);   // Data Reader
        
        double unit;
        double quantity;
        
        
        System.out.println("Enter unit price:");
        unit = keyboard.nextDouble();
        
        System.out.println("Enter quantity of units:");
        quantity = keyboard.nextDouble();
        System.out.println("The total price of 1 unit is: "+quantity);
        
        double revenue = (unit * quantity);
        
        System.out.println("Total amount for "+unit+" unit/s is:" + revenue);
                
        double discount = (revenue * 0.1);
        double discount1 = (revenue * 0.15);
        
        if (quantity >= 100 && quantity<=120){
            
            System.out.println("The revenue form sale after the purchase between 100 and 120 units is " + discount );
        }
        
        else if (quantity>120){
            
            System.out.println("The revenue form sale after discount is " + discount1 );
        }
    }
    
}