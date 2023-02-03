
package triangle.calculator;

import java.util.Scanner;


public class TriangleCalculator {
    
    

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner (System.in);
        
        double firstSide;
        double secondSide;
        
        System.out.println("This program calculates the area and perimeter of a triangle");
        
        System.out.println("Enter the first side of the triangle");
        
        firstSide = keyboard.nextInt();
        
        double Area = (firstSide * secondSide) / 2;
        double Perimeter = firstSide * (secondSide * 2);
        
        System.out.println("Enter the second side of the triangle");
        
        secondSide = keyboard.nextInt();
        
        System.out.println("The area of the triangle is " + Area );
        
        System.out.println("The perimeter of the triangle is" + Perimeter);
        
        
    }
    
}
