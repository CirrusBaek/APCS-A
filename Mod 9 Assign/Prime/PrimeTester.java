
/**
 *Generates a list of prime numbers from lower limit to the upper limit given by the user.
 *
 * @author 
 * @version 3/29/23
 */
import java.util.Scanner;
public class PrimeTester
{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(true){
        System.out.print("Enter the Lower Limit for a prime number or Quit(Q): ");
        String userMinRange=in.nextLine();
        if (userMinRange.equalsIgnoreCase("Q")){
        System.out.println("Goodbye.");
        break;
         }
        System.out.print("Enter the Upper Limit for a prime number or Quit(Q): ");
        String userMaxRange=in.nextLine();
        if (userMaxRange.equalsIgnoreCase("Q")) {
            System.out.println("Goodbye.");
            break;
        } else {
            int uL = Integer.parseInt(userMaxRange);
            int lL = Integer.parseInt(userMinRange);
            Prime pa = new Prime(lL,uL);
            pa.printNumbersAndCalcForPrime();
        }
    }

        
        
        
    }
}
