import java.util.*;

public class CirclePerimeterAndRadiusCalculator {


    public static void main(String[] args) {
       
	double radius;
        double pi = 3.14;
	
	
	Scanner keyboard = new Scanner(System.in);  
        
        System.out.println("Enter the radius of the circle");
        radius = keyboard.nextDouble();
        
        System.out.println("The radius of the circle is = " + radius);
        
        System.out.println("The area of the circle is = " + (pi * (radius * radius)));
        
        System.out.println("The perimeter of the circle is = " + (2 * pi * radius));
        
        
        System.exit(0);
        

    }
}
		
		