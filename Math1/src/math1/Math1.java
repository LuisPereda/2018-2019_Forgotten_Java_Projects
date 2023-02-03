/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math1;

/**
 *
 * @author Owner
 */
public class Math1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        double startingPopulation = 3903;
        
        double percent = 1 + .061;
        double power = Math.pow(percent,47);
        
        double years = 47;
        
        // 3903 (1 + .061)^years
        
        double total1 = startingPopulation;
        double total = startingPopulation * power;
        
      
        
        
        System.out.println(total);
        
    }
    
}
