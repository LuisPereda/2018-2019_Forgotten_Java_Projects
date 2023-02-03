 
package program.with.methods;

import java.util.*;
import java.text.DecimalFormat;


public class ProgramWithMethods {

  
            
    
    
    public static void main(String[] args) {
        // TODO code application logic here
   
Scanner keyboard = new Scanner(System.in);
    
    char code;
    double sumt = 0;
    double sumn = 0;
    double sum = 0;
    
    int countt = 0;
    int countn = 0;
    int count = 0;
    
    double cost;
    double price;
    
    price = readPrice(keyboard);
    
    while (price > 0)
    
    {
        code = readCode(keyboard);
        if(code == 't')
        {
            countt++;
            sumt+= calcCost(price,1.0875);
            System.out.println(sumt);
        }
        
        else
        {
            countn++;
            sumn+= calcCost(price,1);
        }
        
        
        price = readPrice(keyboard);
        
    }
        System.exit(0);
    }
    
    
    


// methods

    
    public static double calcCost(double p, double r){
    
    double cost = p*r;
    System.out.println("The cost for a taxed item priced at $");
    return cost;
}
    

public static char readCode(Scanner k){
k.nextLine();
System.out.println("Enter t for tax or n for no tax");
String dummy =  k.nextLine();
dummy = dummy.toLowerCase();
return dummy.charAt(0);
}

public static double readPrice(Scanner k)
{
    System.out.println("What is the price?");
    return k.nextDouble();
    
    
    
}

}
