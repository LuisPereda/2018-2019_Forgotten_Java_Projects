
package pkgvoid.method.string.change;


public class VoidMethodStringChange {


    public static void main(String[] args) {
String name = "Shakespeare";            // Create a String object containing "Shakespeare".
                                                            // The name variable references the object.
System.out.println("In main, the name is " +  name); // Display the String referenced by the name variable.

changeName(name);                             // Call the changeName method, passing the
                                                                // contents of the name variable as an argument.

System.out.println("Back in main, the name is " + name); // Display the String referenced by the name variable.
   }
   
   /**
      The changeName method accepts a String as its argument and assigns the str parameter to a new String.
   */
   
   public static void changeName(String str)
   {
str = "Dickens";                                   // Create a String object containing "Dickens".
                                                            // Assign its address to the str parameter variable.

      
System.out.println("In changeName, the name " + "is now " + str);       // Display the String referenced by str.

   }
}

