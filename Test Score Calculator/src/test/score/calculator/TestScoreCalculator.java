
package test.score.calculator;

import java.util.Scanner;  // Data Reader

// Written by Luis Pereda

public class TestScoreCalculator {   //HW0910LPProb10

  
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);   // Data Reader
        
        // Test Scores
        
        double Score1;  // First Score
        double Score2;  // Second Score
        double Score3;  // Third Score
        
        System.out.println("This program calculates the average from three numbers");  
        
        System.out.println("Enter the first score"); // Input
        Score1 = keyboard.nextDouble();  // Data Reader
        
        System.out.println("Enter the second score"); //Input
        Score2 = keyboard.nextDouble();  // Data Reader
        
        System.out.println("Enter the third score");  //Input
        Score3 = keyboard.nextDouble();  // Data Reader
        
        double Average = (Score1+Score2+Score3)/3;   // Average
        
        System.out.println("This is the average");  //Output
        
        System.out.println(Average);
        
        System.exit(0);
    }
    
}
