public class MarriottHotelMain //
{
 public static void main(String[] args)
 {
  char code;
  MariottHotelObject non= new MariottHotelObject(" non-member", 0,0);
  MariottHotelObject silver= new MariottHotelObject(" silver-member",1,0);
  MariottHotelObject gold= new MariottHotelObject(" gold-member",1.2,500);
  MariottHotelObject platinum= new MariottHotelObject(" platinum-member",1.5,500);
  MariottHotelObject gen= new MariottHotelObject(" total",0,0);
  
  code=gen.readCode();
  
  while(code=='n'||code=='s'||code=='g'||code=='p')
  {
   if(code=='n')
    {
     non.calculateCost();
     non.calculatePoints();
     }
   
   else if(code=='s')
    {
     silver.calculateCost();
     silver.calculatePoints();
     }
    
   else if(code=='g') 
   {
    gold.calculateCost();
    gold.calculatePoints();
    }
    
   else
   {
    platinum.calculateCost();
    platinum.calculatePoints();
    }
   
   code=gen.readCode();
  }
  
  non.printTotal();
  silver.printTotal();
  gold.printTotal();
  platinum.printTotal();
  
  int sumnn=non.getSumn();
  int sumns=silver.getSumn();
  int sumng=gold.getSumn();
  int sumnp=platinum.getSumn();
  int sumn=sumnn+sumns+sumng+sumnp;
  
  gen.setSumn(sumn);
  
  double sumcn=non.getSumc();
  double sumcs=silver.getSumc();
  double sumcg=gold.getSumc();
  double sumcp=platinum.getSumc();
  double sumc=sumcn+sumcs+sumcg+sumcp;
   
  gen.setSumc(sumc);
  
  int countn=non.getCount();
  int counts=silver.getCount();
  int countg=gold.getCount();
  int countp=platinum.getCount();
  int count=countn+counts+countg+countp;

  gen.setCount(count);
  
  gen.printTotal();
  
   
  
  
  
  
  System.exit(0);
  }
 } 