
package passing.copy.of.argument.into.method;


public class PassingCopyOfArgumentIntoMethod {

    public static void main(String[] args) {
 
      int number = 99;   // number starts with 99
      
System.out.println("number is " + number);  // Display the value in number.
      
      changeMe(number);  // Call changeMe, passing the value in number as an argument
      
System.out.println("number is " + number);  // Display the value in number again.

   }
   
   /** The changeMe method accepts an argument and then changes the value of the parameter. */
   
   public static void changeMe(int myValue)
   {
      System.out.println("I am changing the value.");
      
   myValue = 0; // Change the myValue parameter variable to 0.

System.out.println("Now the value is " + myValue);   // Display the value in myValue.

   }
}
