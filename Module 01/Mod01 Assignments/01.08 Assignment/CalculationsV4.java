
/** Title: 1.08 Arithmetic Calculations
 * The purpose of this program is to display arithmetic expressions and their answers through initialized int variables.
 *
 * @author 
 * @version 
 */
public class CalculationsV4
{
    public static void main(String[ ] args)
    {
        int iNum1=25;
        int iNum2=9;
        int iNum3=11;
        int iNum4=12;
        int iNum5=18;
        // Addition
        System.out.println("Addition");
        System.out.println(iNum1+" + "+iNum2+"= " +(iNum1+iNum2) );
        System.out.println( "43.21 + 3.14= "+(43.21+3.14));
        System.out.println();
        
         //Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3+ " - "+iNum2+" - "+iNum1+"= "+(iNum3-iNum2-iNum1) );
        System.out.println( "3.14 - 10.0= "+(3.14-10) );
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1+" * "+iNum2+"= "+(iNum1*iNum2)); 
        System.out.println("3.14 * 10.0 * 10.0= "+(3.14*10*10) );
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2+" / "+iNum1+"= "+( iNum2/iNum1) );
        System.out.println( "43.21 / 10.0= "+(43.21/10));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3+" % "+iNum2+"= "+(iNum3 % iNum2));
        System.out.println( "10.0 % 3.14= "+(10%3.14) );
        System.out.println();
        
        // 1.08 Additional int Equations
        System.out.println("Multiplication");
        System.out.println(iNum4+" * "+iNum3+" * "+iNum2+"= "+( iNum4*iNum3*iNum2));
        System.out.println();
        
        System.out.println("Modulus");
        System.out.println(iNum4+" % "+iNum5+"= "+ (iNum4%iNum5));
        System.out.println();
        
        
        
        
        // 1.09 Additional double Equations
    }    
}
