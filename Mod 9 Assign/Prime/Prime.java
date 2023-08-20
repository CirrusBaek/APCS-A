
/**
 * client class for primetester
 *
 * @version 3/29/23
 */
public class Prime
{
    private static int upperLimit;
    private static int lowerLimit;
    
    public Prime(int l,int u){
        this.upperLimit=u;
        this.lowerLimit=l;
    }
    public int getupperLimit(){
        return this.upperLimit;
    }
     public int getlowerLimit(){
        return this.lowerLimit;
}
public static boolean isPrime(int number)
    {
        for(int i=2; i<number; i++)
        {
           if(number%i == 0)
           {
               return false; 
           }
        }
        return true; 
    }
    public static void printNumbersAndCalcForPrime() {
      for(int number = lowerLimit; number<=upperLimit; number++)
      {
          if(isPrime(number))
          {
              System.out.print(number+"  ");
          }
      }
      System.out.print("Are prime numbers\n");
    }
        
}
