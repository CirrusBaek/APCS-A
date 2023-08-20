
/**
 * The goal of this program is to calculate the BMI of the user from their height and weight
 * through user input, if/else-if statements,and unit/type conversions.
 *
 * @author 
 * @version (9/16/22)
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String []args){
    Scanner in=new Scanner(System.in);
    String category="";
    System.out.println("Enter your name( first last): ");
    String name= in.nextLine();
    
    System.out.println("Enter your weight in pounds( e.g 175): ");
    String weightString= in.nextLine();
    
    System.out.println("Enter your height in feet and inches( e.g 5 11): ");
    String heightString= in.nextLine();
   
    int weightLbs= Integer.parseInt(weightString);
    //find height by adding feet and inches separately
    String feetString= heightString.substring(0,1);
    String inchesString= heightString.substring(2);
    // parse these strings into int values
    int feetNum= Integer.parseInt(feetString);
    int inchesNum=Integer.parseInt(inchesString);
    
    //final height(inches)
    int heightIn= (feetNum*12)+inchesNum;
    
    //convert to metric
    double weightKg = 0.45359237 * weightLbs;
    double heightM = 0.01*2.54 * heightIn;
    
    //Determine BMR
    double BMI= weightKg/(heightM*heightM);
    
 
        if(BMI<18.5)
           category="Underweight";
           
        else if((BMI>=18.5)&&(BMI<=24.9))
               category="Normal Weight";
           
        else if((BMI>=25)&&(BMI<29.9))
               category="Overweight";
              
        else if(BMI>=29.9)
               category="Obese";
        
    System.out.println();
    System.out.println("Body Mass Index Calculator");
    System.out.println("============================================== ");
   
    System.out.println("Name: "+name);
    //round double values to one digit
    System.out.println("Height (m): "+(int)(10*heightM)/10.0);
    System.out.println("Weight (kg): "+(int)(10*weightKg)/10.0);
    System.out.println("BMI: "+(int)(10*BMI)/10.0);
    System.out.println("Category: "+category);
    
    
   
        
        
        
        
    }
}
