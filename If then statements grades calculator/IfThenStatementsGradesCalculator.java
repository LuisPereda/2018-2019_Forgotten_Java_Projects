
package pkgif.then.statements.grades.calculator;

import java.util.Scanner;


public class IfThenStatementsGradesCalculator {


    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
    
        int Grade;
        int Grade1;
        int Grade2;
        int count=0;
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        
        
  
  System.out.println("Enter one grade");
  Grade = keyboard.nextInt();
  
  System.out.println("Enter a second grade");
  Grade1 = keyboard.nextInt();
  
  System.out.println("Enter a third grade");
  Grade2 = keyboard.nextInt();
  
  int result = (Grade + Grade1 + Grade2) / 3;
  
  while(result>=0&&result<=100)
  {
   if (result>=90 && result<=100)
   {
    System.out.println("Your average is " + result + " therefore you have an A");
    count1++;
   }
    else if(result>=80 && result<90)
    {
     System.out.println("Your average is " + result + " therefore you have a B");
     count2++;
    }
    else if(result>=70 && result<80)
    {
     System.out.println("Yor average is " + result + " therefore you have a C");
     count3++;
    }
    else if(result>=60 && result<70)
    {
     System.out.println("Your average is " + result + " therefore you have a D");
     count4++;
    }
   else
   {
    System.out.println("Your average is " + result + " therefore you Fail");
    count5++;
   }

   System.exit(0);
 
    }
    
}

}
