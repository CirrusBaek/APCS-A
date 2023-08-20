
/** Title: 1.09 Assignment
 * The purpose of this project is to display arithmetic expressions through println statements by using double 
and integer variables to store the numbers.
 *
 * @author 
 * @version 
 */
public class CalculationsV6
{
    public static void main(String[ ] args)
    {
        int iNum1=25;
        int iNum2=9;
        int iNum3=11;
        int iNum4=12;
        int iNum5=18;
        double dNum1=43.21;
        double dNum2=3.14;
        double dNum3=10.0;
        // Addition
        System.out.println("Addition");
        System.out.println(iNum1+" + "+iNum2+"= " +(iNum1+iNum2) );
        System.out.println( dNum1+" + "+dNum2+"= "+(dNum1+dNum2));
        System.out.println();
        
         //Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3+ " - "+iNum2+" - "+iNum1+"= "+(iNum3-iNum2-iNum1) );
        System.out.println( dNum2+" - "+dNum3+"= "+(dNum2-dNum3) );
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1+" * "+iNum2+"= "+(iNum1*iNum2)); 
        System.out.println(dNum2+" * "+dNum3+" * "+dNum3+"= "+(dNum2*dNum3*dNum3) );
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2+" / "+iNum1+"= "+( iNum2/iNum1) );
        System.out.println( dNum1+" / "+dNum3+"= "+(dNum1/dNum3));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3+" % "+iNum2+"= "+(iNum3 % iNum2));
        System.out.println( dNum3+" % "+dNum2+"= "+(dNum3%dNum2) );
        System.out.println();
        
        // 1.08 Additional int Equations
        System.out.println("Multiplication");
        System.out.println(iNum4+" * "+iNum3+" * "+iNum2+"= "+( iNum4*iNum3*iNum2));
        System.out.println();
        
        System.out.println("Modulus");
        System.out.println(iNum4+" % "+iNum5+"= "+ (iNum4%iNum5));
        System.out.println();
        
        System.out.println("Mixed Operations");
        System.out.println(dNum2+" - "+dNum1+" * "+dNum3+"= "+ (dNum2-dNum1*dNum3));
        System.out.println();
        
        System.out.println(dNum1+" / "+dNum3+" % "+dNum3+"= "+ (dNum1/dNum3%dNum3));
        System.out.println();
        
        System.out.println(dNum3+" + "+dNum2+" / "+dNum3+"= "+ (dNum3+dNum2/dNum3));
        System.out.println();
        
        
        
        
    }    
}
