import java.util.*;
public class MariottHotelObject
{
 private String membership,dummy ;
 private double slope, inter, rate,cost,points,sumc;
 private int days,count,sumn;
 private Scanner keyboard= new Scanner(System.in);
 
 public  MariottHotelObject(String w,double m,double b)
 {
  membership=w;
  slope=m;
  inter=b;
  count=0;
  sumc=0;
  sumn=0;
 }
 
 public char readCode()
 {
  System.out.println("Welcome to the Marriot Hotel"); 
  System.out.println("");
  System.out.println(" Enter letter n for non-members");
  System.out.println(" Enter letter s for Silver members");
  System.out.println(" Enter letter g for Gold members");
  System.out.println(" Enter letter p for Platinum members");
  dummy=keyboard.nextLine();
  dummy=dummy.toLowerCase();
  return dummy.charAt(0);
 }
 
 public double calculateCost()
 {
  count++;
  days=readDays();
  rate=readRate();
  cost=(days*rate+20)*1.094;
  System.out.println(" You are a "+membership+" and your total days spent were "+days+" days for the cost of $"+cost);
  sumn+=days;
  sumc+=cost;
  return cost;
  
  
  
 }
 
 public int readDays()
 {
  System.out.println("How many days did you stay?");
  days=keyboard.nextInt();
  keyboard.nextLine();
  return days;
 }
 
 public double readRate()
 {
  System.out.println("What is your room rate?");
  rate=keyboard.nextDouble();
  keyboard.nextLine();
  return rate;
 }
 
 public double calculatePoints()
 {
  points=slope*cost+inter;
  System.out.println(" and you earned "+points+" points.");
  return points;
 }
 
 public int getSumn()
 {
  return sumn;
 }
 
 public void setSumn(int n)
 {
  sumn=n;
 }
 
 public double getSumc()
 {
  return sumc;
 }
 
 public void setSumc(double o)
 {
  sumc=o;
 }  
 
 public int getCount()
 {
  return count;
 }
 
 public void setCount(int c)
 {
  count=c;
  }
 
 public void printTotal()
 {
  System.out.println("There were/was "+count+" "+membership+"who spent "+sumn+" nights for $"+sumc);
  
 }
 
 }