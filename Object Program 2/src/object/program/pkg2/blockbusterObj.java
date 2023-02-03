
package object.program.pkg2;

import java.util.*;
class blockbusterObj {
   
 private int count;
 private double sum, price;
 private String word,dummy;
 private Scanner keyboard=new Scanner(System.in);
 
 public blockbusterObj(String w)
 {
  sum=0;
  count=0;
  word=w;
 }
 public char ReadCode()
 {
  System.out.println("What is the code?");
  dummy= keyboard.nextLine();
  dummy=dummy.toLowerCase();
  return dummy.charAt(0);
 }
 
 public void readPrice()
 {
  System.out.println("What is the price?");
  price= keyboard.nextDouble();
  keyboard.nextLine();
 }
 // hard part
 public void calculation()
 {
  readPrice();
  count++;
  sum+=price;
  
 }
}