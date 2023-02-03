import java.util.Scanner;


public class ComparingStrings {


    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String name1;
        String name2;
        
        
        System.out.println("Enter the first string");
        name1 = keyboard.nextLine();
        
        
        System.out.println("Enter the second string");
        name2 = keyboard.nextLine();
        
       if(name1.equals(name2)){
           
           System.out.println("The names are equal");
       }
       else if(!name1.equals(name2)){
           
           System.out.println("The names are not equal");
       }
      
    }
}