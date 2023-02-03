
package writing.data.on.files.pkg3;

import java.util.Scanner;

import java.io.*;

public class WritingDataOnFiles3 {

 
    public static void main(String[] args) throws Exception {
        
        PrintWriter outputFile = new PrintWriter("DealershipRecords.txt");
       
        Scanner keyboard = new Scanner(System.in);
        
        String name,name1,name2;
        String car,car1,car2;
        int carYear,carYear1,carYear2;
        
        System.out.println("This program asks the name of three customers and their rental choice");
        
        System.out.println("Enter the name of the first customer");
        name = keyboard.nextLine();
        
        System.out.println("Enter the name of the second customer");
        name1 = keyboard.nextLine();
        
        System.out.println("Enter the name of the third customer");
        name2 = keyboard.nextLine();
        
        System.out.println("Enter the car model of the first customer");
        car = keyboard.nextLine();
        
        System.out.println("Enter the car model of the second customer");
        car1 = keyboard.nextLine();
        
        System.out.println("Enter the car model of the third customer");
        car2 = keyboard.nextLine();
        
        System.out.println("Enter the car year of the first customer");
        carYear = keyboard.nextInt();
        
        System.out.println("Enter the car year of the first customer");
        carYear1 = keyboard.nextInt();
        
        System.out.println("Enter the car year of the first customer");
        carYear2 = keyboard.nextInt();
        
        
        outputFile.println("Name");
        outputFile.println(name + name1 + name2);
        outputFile.println("Model");
        outputFile.println(car+ car1+ car2);
        outputFile.println("Year");
        outputFile.println(carYear+ "" +carYear1+ "" + carYear2);
        
        
        
        
        outputFile.close();
        
        
    }
    
}
