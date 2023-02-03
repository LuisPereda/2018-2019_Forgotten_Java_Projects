


  import java.util.*;   
  

public class HW0910LPMembersFees {

  
  
    public static void main(String[] args) {
        
        long years;
        long age;
        double fee;
        String name;
        
        Scanner keyboard = new Scanner(System.in);   // Data Reader
       
        
        System.out.println("This program calculates regular and senior fee depending on age");
        System.out.println("Enter the name");
        name = keyboard.nextLine();
      
        
        System.out.println("Enter age");
        age = keyboard.nextLong();
        System.out.println("Enter how many years the person has been a member for");
        years = keyboard.nextLong();
        
              
        if(age>50)
        {
            fee = 100 + .5*(100 - years);
            System.out.println(name+" is "+age+" years old and has been a member for "+years+" years ");
            System.out.println("and will have to pay a regualr fee of $"+fee+".");
        }
        
        else
        {
            fee = 300 + .2 *(70 - years);
            System.out.println(name+" is "+age+" years old and has been a member for "+years+" years");
            System.out.println("and will have to pay a regualr fee of $"+fee+".");
        }
        
        System.exit(0);
    }
}
  
      
    
