public class EnergyDrinkConsumption {  


    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);   // Input Reader
        int Costumers = 12467;     // Total # of Costumers
        double goodConsumers = 0.14; // Consume more than one drink per week
        double citrusConsumers = 0.64;  // Prefer a citric drink
        
        
        System.out.println("This program calculates statistics for a specific company");   // Output
        System.out.println("A soft drink company recently surveyed 12,467 of its customers\n" + "and found that approxi- mately 14 percent of those surveyed\n" + "purchase one or more energy drinks per week. Of those\n" +
"customers who purchase energy drinks, approximately 64 percent\n" + "of them prefer citrus- flavored energy drinks.");   // Output
        
        
        double Total = (Costumers * goodConsumers);   // State Tax
        double Total1 = (Total * citrusConsumers); // County Tax
        
        System.out.println("This is the amount of costumers that purchase one or more energy drinks per week"); // Output
        System.out.println(Total + (" Costumers")); // Output
        
        System.out.println("This is the amount of costumers that prefer citrus flavored drinks");  // Output
        System.out.println(Total1 + (" Costumers"));  // Output
        
        
        
         System.exit(0);
        
        
    }
    
}
