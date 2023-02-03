
package word.game;

import java.util.Scanner;

// Written by Luis Pereda

public class WordGame {    //HW0910LPProb18

 
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);  // Data Reader 
        
        String name;  // Name of Person
        int age;     // Age of Person
        String City;  // Favorite City
        String College;   // College
        String Proffesion;  // Profession
        String Animal;  // Favorite Animal
        String Pet;   // Pet's name
        
        
        
        System.out.println("This program takes the users information and creates a short story about them");  // Output
        
        System.out.println("Enter a name?");  // Prompt
        name = keyboard.nextLine(); // reads the data
        System.out.println("Enter the name of a city");  // Prompt
        City = keyboard.nextLine(); // reads the data
        System.out.println("Enter the name of a college");  // Prompt
        College = keyboard.nextLine(); // reads the data
        System.out.println("Enter a profession");  // Prompt
        Proffesion = keyboard.nextLine(); // reads the data
        System.out.println("Enter your favorite animal");  // Prompt
        Animal = keyboard.nextLine(); // reads the data
        System.out.println("Enter a pet's name");   // Prompt
        Pet = keyboard.nextLine(); // reads the data
        System.out.println("Enter a number?");  // Prompt
        age = keyboard.nextInt(); // reads the data
        
        
        System.out.println("There once was a person named " + name + (" who lived in " + City + (". At the age of,\n " + age  + (" " +name + (" went to college at " + College + (", " + name + (" graduated and went to work as a\n " +Proffesion + (". Then, " +name + (" adopted a(n) " + Animal + (" named " + Pet + (". They both lived happily ever after!"))))))))))); // Output
        
        System.exit(0);
        
        
    }
    
}
