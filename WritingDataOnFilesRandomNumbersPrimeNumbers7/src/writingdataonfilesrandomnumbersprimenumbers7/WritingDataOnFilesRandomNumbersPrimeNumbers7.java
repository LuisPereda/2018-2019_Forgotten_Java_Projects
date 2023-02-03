/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writingdataonfilesrandomnumbersprimenumbers7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class WritingDataOnFilesRandomNumbersPrimeNumbers7 {

  
    public static void main(String[] args) throws FileNotFoundException {
        
             
        PrintWriter outputFile = new PrintWriter("RandomPrimeNumbers.txt");

 
   {		
       int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";

       for (i = 1; i <= 1000; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Data written to file");
       outputFile.println("Prime numbers from 1 to 1000 are :");
       outputFile.println(primeNumbers);
       outputFile.close();
   }
}
    }

