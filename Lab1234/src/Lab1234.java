  import java.util.*;   


public class Lab1234 {

   
    public static void main(String[] args) {
        
        String character;
        int interger;
        float decimal;
        long bigNumber;
        
        Scanner keyboard = new Scanner(System.in);   // Data Reader
        
        System.out.println("Enter a character");
        character = keyboard.nextLine();
        
                
        System.out.println("Enter an interger");
        interger = keyboard.nextInt();
        
        
        System.out.println("Enter a decimal");
        decimal = keyboard.nextFloat();
        
        
        System.out.println("Enter a long number");
        bigNumber = keyboard.nextLong();
        
        System.out.println("Your character is " + character.charAt(0));
        System.out.println("Your interger is " + interger);
        System.out.println("Your decimal is " + decimal);
        System.out.println("Your long number is " + bigNumber);
        
        System.exit(0);
       
    }
    
}



