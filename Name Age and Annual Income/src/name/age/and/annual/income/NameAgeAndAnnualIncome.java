
package name.age.and.annual.income;

import java.util.Scanner;  // Data Reader

// Written by Luis Pereda

public class NameAgeAndAnnualIncome  {  //HW0910LPProb1

   // Name, Age and Annual Income 
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in); // Data Reader
        
        String name; // Name
        int age;    // Age
        double annualPay;  //Annual Pay
        
        System.out.println("This program takes the usere's\n" + "information and creates a short description\n"); //Description
        
   System.out.println("What is your name ?"); //Prompt
   name = keyboard.nextLine();// read the data 
   
   
   System.out.println("What is your age ?");  //Prompt
   age = keyboard.nextInt();
   
   System.out.println("How much do you hope to earn per year ?");  //Prompt
   annualPay = keyboard.nextDouble();// read the data 
   
   System.out.println("My name is " + name + (", my age is " + age + (" and I hope to earn " + ("$" + annualPay + (" per year."))))); //Output
        
   
   System.exit(0); // Ends Program

    }
    
}



    