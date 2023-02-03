
package writingdataonfilesrandomnumbers5;
import java.util.Random;
import java.util.Scanner;



 
public class WritingDataOnFilesRandomNumbers5 {


    public static void main(String[] args) throws InterruptedException {
        
      Scanner keyboard = new Scanner(System.in);
        
        
 System.out.println("This program displays random numbers divisible by 5"); 

 String answer = "yes";

 
 int end = 1; 

 

     
 
 
 while(end == 1){

//method

loop();

System.out.println("Would you like to continue the loop (enter 1 for yes and 0 for no)");   
 end = keyboard.nextInt();
 
    }
if(end  == 2){
     
     System.out.println();
 }
 

    }
 
    

public static void loop() throws InterruptedException{
 
    
 int count = 0;
 int count1 = 20;
    
    
    while(count < count1){

    
     
     Random rand = new Random();
 int randomNumber = rand.nextInt(100);

while (randomNumber % 5 == 0 && count < count1){ System.out.println(randomNumber +", ");


count++;

Thread.sleep(200);

break;
}
}
 
}
    }
 
    

     



    





           







 



     

 
           

    
    

    

