
package personal.information;

import java.util.Scanner;  // Data Reader

public class PersonalInformation {   
public static void main(String[] args) {
        
        
        // Personal Information
        
        Scanner keyboard = new Scanner(System.in);  // Data Reader
        
        String Name;   // Name
        String Adress; // Adress
        int Adress1;  // Adress #
        String CityAndState;   // City and State
        int Zip;     // Zip
        Long Telephone;  // Telephone
        String CollegeMajor;     // College Major
        
        System.out.println("Enter your name?");   //Prompt
        Name = keyboard.nextLine(); // reads the data
        System.out.println("Enter your adress as indicated below.");   //Prompt
        System.out.println("Name of street or avenue first. Press enter and enter the number of street or avenue. ");
        System.out.println("Enter the name of street or avenue ");   //Prompt
        Adress = keyboard.nextLine(); // reads the data
        System.out.println("Enter the number of street or avenue");   //Prompt
        CityAndState = keyboard.nextLine(); // reads the data
        System.out.println("Enter a city and state");        //Prompt
        CollegeMajor = keyboard.nextLine(); // reads the data 
        System.out.println("Enter your house or building number");    //Prompt
        Adress1 = keyboard.nextInt(); // reads the data
        System.out.println("Enter your zip code");   //Prompt
        Zip = keyboard.nextInt(); // reads the data
        System.out.println("Enter your telephone number");    //Prompt
        Telephone = keyboard.nextLong(); // reads the data
        
        
        
        System.out.println(("\n") + Name + ("\n") + Adress1 + Adress + ("," + CityAndState + ("," + Zip + ("\n") + Telephone + ("\n") + CollegeMajor)));  // Output
        
        System.exit(0); // Ends Program
        
    }
    
}
