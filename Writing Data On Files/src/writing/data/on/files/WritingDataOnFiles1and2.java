
package writing.data.on.files;


import java.util.Scanner;
import java.io.IOException;
import java.io.*;

public class WritingDataOnFiles1and2 {

 
    public static void main(String[] args) throws IOException {
      Scanner keyboard = new Scanner(System.in);
      
        //int number = 1;
    
       //while(number == 1){
        
        File file = new File("Lab.txt");
        FileWriter fw = new FileWriter(file,true);
        PrintWriter outputFile = new PrintWriter(fw);
  
        String name,name1,name2;
        int idNumber,idNumber1,idNumber2;
        int grade,grade1,grade2;
        
      
         System.out.print("Enter the name of the first student:");
         name = keyboard.nextLine();
         System.out.print("Enter " + name + "'s " +"ID number:");
         idNumber = keyboard.nextInt();
         System.out.print("Enter " + name +"'s "+"grade:");
         grade = keyboard.nextInt();
         
         keyboard.nextLine();
      
         System.out.print("Enter the name of the second student:");
         name1 = keyboard.nextLine();  
         System.out.print("Enter " + name1 + "'s" +" ID number:");
         idNumber1 = keyboard.nextInt();
         System.out.print("Enter " + name1 +"'s "+"grade:");
         grade1 = keyboard.nextInt();
      
      
         keyboard.nextLine();
      
         System.out.print("Enter the name of the third student:");
         name2 = keyboard.nextLine();
       System.out.print("Enter " + name2 + "'s " +" ID number:");
         idNumber2 = keyboard.nextInt();
         System.out.print("Enter " + name2 +"'s "+"grade:");
         grade2 = keyboard.nextInt();
           
        outputFile.println(("Name                   ID Number              Grade"));
        outputFile.println("                                                                                        ");
      
        
         

            outputFile.printf("%1s%18s%22s",name,idNumber,grade+"\n");
            outputFile.printf("%1s%18s%22s",name1,idNumber1,grade1+"\n");
            outputFile.printf("%1s%18s%22s",name2,idNumber2,grade2+"\n");
             
             
         
    
         
         
      // Close the file.
      outputFile.close();
      System.out.println("Data written to the file.");
     
      //System.out.println("Press 1 to continue or 0 to end the program");
      //number = keyboard.nextInt();
      
      //if(number == 0){
          //System.exit(0);
      //}
      
       }
      
    }
  //}
    



    
