/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writingdataonfilesrandomnumbers6;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author Owner
 */
public class WritingDataOnFilesRandomNumbers6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       

        
        PrintWriter outputFile = new PrintWriter("RandomNumbers0-10.txt");
       
          int y = 0;
        
        
      for(int x = 100;y < x; y++ )  {
 Random rand = new Random();
 int randomNumber = rand.nextInt(10);

 
 System.out.println(randomNumber);
 
 outputFile.println(randomNumber);
 outputFile.close();

    }
      
      
      
}
    
}
    
