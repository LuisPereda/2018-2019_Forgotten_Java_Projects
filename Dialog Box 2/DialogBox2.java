package dialog.box.pkg2;
import javax.swing.JOptionPane;
public class DialogBox2 {

    
    public static void main(String[] args) {
       
        String radius  = JOptionPane.showInputDialog("Enter the radius of the circle");
        
        
        
        double Radius = Double.parseDouble(radius);
        
        double pi = 3.14;
 
     JOptionPane.showMessageDialog(null, "The radius of the circle is " + Radius);
       
     JOptionPane.showMessageDialog(null, "The area of the circle is " + (pi * Radius * Radius));
       
     JOptionPane.showMessageDialog(null, "The perimeter of the circle is " + (2 * pi * Radius));
     
     System.exit(0);
        
    }
    
}
