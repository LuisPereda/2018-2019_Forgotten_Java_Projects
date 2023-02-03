/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6.out.of.pkg7;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Lab6OutOf7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  

        int ldig, num;

        Scanner in = new Scanner(System.in);

        while (true){
        
        System.out.println("Enter an Integer.");
        num = in.nextInt();

        ldig = num % 10;

        // keep looping num until it is in the range of 0-9
        while (num >= 10) {
            num = num / 10;
        }
        //initialize fdig variable and set it equal to num, just to make things clearer
        int fdig = num;

        System.out.println("The first digit is " + fdig + ", and the last digit is " + ldig + ".");
    }
}
 
}