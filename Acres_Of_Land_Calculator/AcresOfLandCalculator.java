import java.util.Scanner;   // Data Reader


public class AcresOfLandCalculator {     


    public static void main(String[] args) {
 
   // Calculate the amount of acres in a tract of land
   
   
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("This program calculates the amount of acres in a tract of land"); // Output
   
        System.out.println("Enter yes to start the program or no to end the program:");
        String response = keyboard.next();
while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
  System.out.println("\nInvalid response. Try again.");
  response = keyboard.next();
} 
if (response.equalsIgnoreCase("no")) {
    System.out.println("Program ended");
  System.exit(0);
} else {
  System.out.println("\nGreat! Let's get started.");
  
  double Acre = 43560  ; // One Acre
  double Land ;   // Land Input
  
  
    System.out.println("One acre is equal to 43560 feet"); // Output
  
    System.out.println("Enter the amount of land to convert into acres");  // Prompt
    Land = keyboard.nextDouble();// read the data   
   
   

   double Total=(Land/Acre);
    System.out.println("The total amount of acres is");  // Output
    System.out.println(Total + (" acres"));  //Output
  
}
   

  
    
  }
}



