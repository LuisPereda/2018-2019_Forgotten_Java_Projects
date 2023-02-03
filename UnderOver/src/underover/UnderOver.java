
package underover;


public class UnderOver {

    public static void main(String[] args) {

        //define the instances
        
        underOverObj over = new underOver("Over");
        underOverObj under = new underOver("Under");
        underOverObj general = new underOver("");
        double price;
        price = general.ReadPrice();
        while(price>0)
        {
            if(price>=100)over.Calculations();
            else under.Calculations();
            price = general.REadPRice();
        }    
        
        
        
        
        
        
        System.exit(0);
    }
    
}

import java,util.*;
public class underOverObj
{
    private price, sum, count;
    private String word;
    private Scanner keyboard = new Scanner(System).in);
    public underOverObj(String w)
    {
        sum = 0;
        count 0;
        word = w;
    }
    public double ReadPrice();
    {
        System.out.pritnln("What is tha price");
        price = keyboard.nextDouble();
        System.out.println(price);
    }
            
    }
