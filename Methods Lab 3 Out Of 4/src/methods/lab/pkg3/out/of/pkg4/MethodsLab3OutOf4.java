/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods.lab.pkg3.out.of.pkg4;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class MethodsLab3OutOf4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        System.out.println("This program adds two types of sales and displays the result");
        
        add();
        
    }
    
    
    public static void add(){
        
        Scanner keyboard = new Scanner(System.in);
        
        int euroSales;
        int asiaSales;
        
        
        System.out.println("Enter the amount of European sales");
        euroSales = keyboard.nextInt();
        
        System.out.println("Enter the amount of Asian sales");
        asiaSales = keyboard.nextInt();
        
        int eurasiaSales = euroSales + asiaSales;
        
        System.out.println("The addition of the European and Assian sales is: " + eurasiaSales);
        
    }
    
    
    
    
}
