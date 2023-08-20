
/**
 * The purpose of this program is to calculate the total daily expenditure of a user by their gender,BMR, and activity level.
 * 
 *
 * @author 
 * @version 9/19/22
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        double activityFactor=0;
        double TDEE;
        
        System.out.print("Please enter your name:");
        String name=in.nextLine();
        System.out.print("Please enter your BMR:");
        String BMR=in.next();
        System.out.print("Please enter your gender(M/F):");
        String gender=in.next();
        System.out.println();
        
        System.out.println("Select your activity level");
        System.out.println("[A] Resting(Sleeping, Reclining)");
        System.out.println("[B] Sedentary(Restricted Mobility)");
        System.out.println("[C] Light(Sitting, Standing)");
        System.out.println("[D] Moderate(Light manual labor,Dancing,Biking)");
        System.out.println("[E] Very Active(Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active(Full-Time Athlete, Heavy Manual Labor)");
        System.out.println();
        
        System.out.print("Enter the letter corresponding to your activity level:");
        String activityLevel=in.next();
        
        if(activityLevel.equalsIgnoreCase("A"))
        {
            activityFactor=1.0;
            
        }
       else if(activityLevel.equalsIgnoreCase("B"))
        {
            activityFactor=1.3;
        }
        else if((activityLevel.equalsIgnoreCase("C"))&&(gender.equalsIgnoreCase("M")))
        {
            activityFactor=1.6;
        }
        else if((activityLevel.equalsIgnoreCase("C"))&&(gender.equalsIgnoreCase("F")))
        {
            activityFactor=1.5;
   
        }
        else if((activityLevel.equalsIgnoreCase("D"))&&(gender.equalsIgnoreCase("M")))
        {
            activityFactor=1.7;
            
        }
        else if((activityLevel.equalsIgnoreCase("D"))&&(gender.equalsIgnoreCase("F")))
        {
            activityFactor=1.6;
            
        }
        else if((activityLevel.equalsIgnoreCase("E"))&&(gender.equalsIgnoreCase("M")))
        {
            activityFactor=2.1;
            
        }
        else if((activityLevel.equalsIgnoreCase("E"))&&(gender.equalsIgnoreCase("F")))
        {
            activityFactor=1.9;
            
        }
        else if((activityLevel.equalsIgnoreCase("F"))&&(gender.equalsIgnoreCase("M")))
        {
            activityFactor=2.4;
            
        }
        else if((activityLevel.equalsIgnoreCase("F"))&&(gender.equalsIgnoreCase("F")))
        {
            activityFactor=2.2;
            
        }
        else
        {
            System.out.println("You've entered an invalid option for activity level.");
            System.exit(0);//stops the program
        }
        
       
       
    
        
        String newGender=gender.toUpperCase();//converts gender to an uppercase(if lowercase) for the display purpose
        double newBMR= Double.parseDouble(BMR); //parses BMR to a double value for calculation purpose
        TDEE=newBMR*activityFactor;
        
        System.out.println();
        System.out.println();
        System.out.println("Your Results:");
        System.out.println("Name: "+name+"\t"+"\t"+"\t"+"Gender: "+newGender);
        System.out.println("BMR: "+newBMR+" calories"+"\t"+"\t"+"Activity Factor: "+activityFactor);
        System.out.println("TDEE: "+TDEE+" calories");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
