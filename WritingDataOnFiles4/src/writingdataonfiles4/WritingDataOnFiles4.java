
package writingdataonfiles4;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class WritingDataOnFiles4 {


    public static void main(String[] args) throws FileNotFoundException {
Scanner keyboard = new Scanner(System.in);

PrintWriter outputFile = new PrintWriter("Maximum Value Finder.txt");
        
   int numbers[]= {1,5,-9,12,-3,89, 18,23,4,-6};
  
    //Find maximum (largest) value in array using loop
	   System.out.println("Maximum Value = " + getMaxValue(numbers));
           
           
           
   outputFile.close();
           
    }
    
    
    
    
    
//Find maximum (largest) value in array using loop
	public static int getMaxValue(int[] numbers){
		int maxValue = numbers[0];
		for(int i=1;i<numbers.length;i++){
			if(numbers[i] > maxValue){
				maxValue = numbers[i];
			}
		}
		return maxValue;
                
	}
	
}
