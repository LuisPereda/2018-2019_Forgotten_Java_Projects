/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner keyboard = new Scanner(System.in);  // Data Reader
        
        double percentage= .061;
        
       double population = 3903;
       
       double pxp = percentage * population;
       
       double total = population + pxp;
       
       System.out.println(pxp);
       
       System.out.println(total);
       
       
        
        
    }
    
}
