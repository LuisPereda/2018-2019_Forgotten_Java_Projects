import java.util.Scanner;

public class Phone_Lottery {


    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);
        
        String name1;
        String name2;
        
        System.out.println("Welcome you must select a carrier and a cellphone");
        
        System.out.println("The available carriers are Verizon, Sprint, AT&T and T-mobile");
        
        System.out.println("The available phones are IphoneX, Iphone 7 and Note 8, ");
        
        System.out.println("Please select a carrier");
        name1 = keyboard.nextLine();
        
        System.out.println("Please select a phone");
        name2 = keyboard.nextLine();
        
        
        if (name1.equals("Verizon") && name2.equals("IphoneX")){
            
            System.out.println("You earned $300 dollars and one camera");
        }
        
        else if (name1.equals("Sprint") && name2.equals("Iphone 7")){
            
            System.out.println("You earned $200 dollars an another Iphone 7 gift");
        }
        
        else if (name1.equals("AT&T") && name2.equals("IponeX")){
            
            System.out.println("You earned $300 dollars");
        }
        
        else if (name1.equals("Tmobile") && name2.equals("Note 8")){
            
            System.out.println("Another Note 8 gift");
        }
        
        else if (name1.equals("Sprint") && name2.equals("Note 8")){
            
            System.out.println("You earned $300 dollars");
        }
        
        else{
            
            System.out.println("Did not win try again");
       
        
    }
    
}
}
