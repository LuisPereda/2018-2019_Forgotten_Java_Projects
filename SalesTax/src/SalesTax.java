
import java.util.*;

public class SalesTax {

    public static void main(String[] args) {
  
        {

// Create a Scanner object to read from the keyboard. Scanner keyboard = new Scanner(System.in);
Scanner keyboard = new Scanner(System.in);   // Data Reader


// Identifier declarations final double TAX_RATE = 0.055; double price;

double TAX_RATE = 0.055;
double price; 
String item;

// Display prompts and get input. System.out.print("Item description:	"); item = keyboard.nextLine(); System.out.print("Item price:	$");
System.out.print("Type the name of the item you are purchasing today? ");
item = keyboard.nextLine();

System.out.print("Enter the price of the item ");
price = keyboard.nextDouble();

// Perform the calculations. tax = price + TAX_RATE;
double tax = price + TAX_RATE;

// Display the results. System.out.print(item + "		$"); System.out.println(price); System.out.print("Tax	$"); System.out.println(tax); System.out.print("Total	$"); System.out.println(total);

System.out.print(item + "	$"); System.out.println(price); System.out.print("Tax	$"); System.out.println(TAX_RATE); System.out.print("Total	$"); System.out.println(tax);

System.exit(0);

}
}

        
    }
    

