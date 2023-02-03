import java.util.Scanner;


public class ConcatenatedNames {


    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);
        
        
        String name1;
        String name2;
        
        
        System.out.println("Enter the first name");
        name1 = keyboard.nextLine();
        
        
        System.out.println("Enter the second name");
        name2 = keyboard.nextLine();
        
        System.out.println("The first name concatenation is " + name1.charAt(0));
        
        System.out.println("The second name concatenation is " + name2.charAt(0));
        
    }
    
}
