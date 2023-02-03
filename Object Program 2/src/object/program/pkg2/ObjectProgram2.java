
package object.program.pkg2;


public class ObjectProgram2 {

   
    public static void main(String[] args) {
     
 char code;
 blockbusterObj food= new blockbusterObj(" food ");
 blockbusterObj dvd= new blockbusterObj(" dvd ");
 blockbusterObj hdvd= new blockbusterObj(" hdvd ");
 blockbusterObj member= new blockbusterObj(" membership ");
 blockbusterObj gen= new blockbusterObj(" total ");
    
 
 while(code =='f'|| code =='d'||code =='h'||code =='m')
 {
  if(code=='f') food.calculation();
  else if(code=='d') dvd.calculation();
  else if (code=='h') hdvd.calculation();
  else member.calculation();
  
  code=gen.ReadCode();
 
 }
 
 System.exit(0);
 }
}
        
        
    
    

