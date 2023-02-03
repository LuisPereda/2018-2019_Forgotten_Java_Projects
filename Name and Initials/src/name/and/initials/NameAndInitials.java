
package name.and.initials;

import java.util.Scanner; // Data Reader

// Written by Luis Pereda

public class NameAndInitials {   //HW0910LPProb2

  
    public static void main(String[] args) {
                

// String Manipulator
        
 
     char firstInitial;  //First Initial
     String firstName;   //First Name
     char secondInitial; //Second Initial
     String middleName;  //Middle Name
     char lastInitial;   //Last Initial
     String lastName;    //Last Name
     
     
     
     
             
     Scanner keyboard = new Scanner(System.in);  // Data Reader
     
     System.out.println("Enter your first name");  // Prompt
     firstName = keyboard.nextLine(); // Data Reader
     
     System.out.println("Enter your middle name"); // Prompt
     middleName = keyboard.nextLine();  // Data Reader
     
     System.out.println("Enter your last name");   // Prompt
     lastName = keyboard.nextLine();  // Data Reader
     
     
     System.out.println("Your initials are ");    // Result
     
     System.out.println(firstName.charAt(0));     // First Name Data
     System.out.println(middleName.charAt(0));    // Middle NameData
     System.out.println(lastName.charAt(0));      // Last Name Data
     
     System.exit(0); // Ends Program
     

    }
}
    