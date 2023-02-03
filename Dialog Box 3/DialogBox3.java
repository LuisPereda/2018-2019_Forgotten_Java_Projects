
package dialog.box.pkg3;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class DialogBox3 {


    public static void main(String[] args) {
       
        
        
        
        String character  = JOptionPane.showInputDialog("Enter a character");
        
        String interger  = JOptionPane.showInputDialog("Enter an interger");
        
        String decimal  = JOptionPane.showInputDialog("Enter a decimal");
        
        String number  = JOptionPane.showInputDialog("Enter a long number");
        
        
        
            String Character = character;
            int Interge = Integer.parseInt(interger);
            float Decimal = Float.parseFloat(decimal);
            long Number = Long.parseLong(number);
            char code;
            
            
          JOptionPane.showMessageDialog(null, "Your character is " + character.charAt(0));
          
          JOptionPane.showMessageDialog(null, "The interger is " + Interge);
          
          JOptionPane.showMessageDialog(null, "The decimal number is " + Decimal);
          
          JOptionPane.showMessageDialog(null, "The long number is " + Number);
          
          
        
        
          System.exit(0);
    }
    
}

