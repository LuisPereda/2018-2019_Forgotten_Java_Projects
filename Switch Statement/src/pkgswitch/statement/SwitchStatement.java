
package pkgswitch.statement;

import java.util.Scanner;

public class SwitchStatement {


    
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);

  
  System.out.println("Enter a,b,c,d for the correct answer");

  String str = keyboard.next();
  char grade = str.charAt(0);
        
        switch (grade){
            
            case 'a':  {System.out.println("Wrong answer");
                     break;}
            case 'b':  {System.out.println("Correct answer");
                     break;}
            case 'c':  {System.out.println("Wrong answer");
                     break;}
            case 'd':  {System.out.println("Wrong answer");
                     break;}
            default: {System.out.println("undefined answer");
                break;}
            }
            
        }
      
}

    
    

   // Switch statement allows a variable to ve tested for equality against a list of vlaues. Each value is called a case, and
        //the variable being switched on is checked for each case
        
        /* Syntax
        
        Switch (expresion){
         
        case value 1:
        "Statements which be executed if expression equal to case value 1?
        break;    //optional
        
        case value 2;
        statements which be executed if expression equal to case value 2?
        break;
        
        // you can have any  number of case statements
        
        default: //optional, execute if expression doesnt equal to any case values// statements
        }
        
        */
        
        