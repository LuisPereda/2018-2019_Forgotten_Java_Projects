import java.util.Scanner;



public class CookieCalories {


    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        double bagofCookies = 40;  //Test Values
        double totalServings = 10; //Test Values
        double caloriesperServing = 300;  //Test Values
        int cookiesEaten; 
        
        
        System.out.println("This program calculates total calories consumed assuming that each cookie contains 300 calories");
        System.out.println("Enter the amount of cookies that you consumed");
        cookiesEaten = keyboard.nextInt(); // reads the data
        double Total = (cookiesEaten * 75);   // State Tax
        System.out.println("This is the total amount of calories you consumed");
        System.out.println(Total +"Calories");
        
        System.exit(0); 
        
        
    }
    
}