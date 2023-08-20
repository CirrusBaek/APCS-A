/**
 * The purpose of this project is to generate random passwords at the length the user specified.
 *
 * @author 
 * @version FLVS 2021
 * date 10/5/22
 * 
 **/
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPasscode
{
  public static int pwLength = 0;
  public static String passcodeUnit="";
  public static int count=0;
  public static void method(){
      count++;
    int i1=(int)(Math.random()*(91-65)+65);
    int i2=(int)(Math.random()*(123-97)+97);
    int i3=(int)(Math.random()*(58-48)+48);
    int i4=(int)(Math.random()*(91-65)+65);
    int i5=(int)(Math.random()*(123-97)+97);
    int i6=(int)(Math.random()*(58-48)+48);
    passcodeUnit=""+(char)i1+(char)i2+(char)i3+(char)i4+(char)i5+(char)i6;
   
    while(passcodeUnit.length()!=pwLength){
    
    int i7=(int)(Math.random()*(91-65)+65);
    passcodeUnit+=(char)i7;
    
       
    }
    
} 
    public static void main(String [] args) throws IOException
    {
        String token="";

    // initialize scanner and print writer
        Scanner in = new Scanner(System.in);
       
        //initialize file 
        PrintWriter outFile = new PrintWriter(new File("passcode.txt"));
        File fileName = new File("passcode.txt");
        Scanner inFile = new Scanner(fileName);
    

        System.out.println("**********************************************************");
        System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");
        
        // the user wants to continue
        System.out.print("Enter a password length(6 or more): ");
        pwLength= in.nextInt();
        
        while(pwLength<6){
            System.out.println("Password length too short. Please try again");
            System.out.print("Enter a password length(6 or more): ");
            pwLength=in.nextInt();
        }
        
        System.out.println();
        System.out.println("A password has been written to the text file.");
        method();
        outFile.println("Here are your randomly generated codes:");
         outFile.println(count+"\t"+passcodeUnit);
        System.out.print("Would you like to generate another password?(Y/N): ");
        String userInput= in.next();
        
        while(userInput.equalsIgnoreCase("Y")){
            System.out.print("Enter a password length(6 or more): ");
            pwLength=in.nextInt();
            while(pwLength<6){
            System.out.println("Password length too short. Please try again");
            System.out.print("Enter a password length(6 or more): ");
            pwLength=in.nextInt();
        }
        System.out.println();
        System.out.println("A password has been written to the text file.");
        method();
        outFile.println(count+"\t"+passcodeUnit);
        System.out.print("Would you like to generate another password?(Y/N): ");
        userInput=in.next();
        
        } 
     if(userInput.equalsIgnoreCase("N"))
        {
        System.out.println();
        System.out.println("Thank you for using the passcode generator.");
        System.out.println();
        
        }
        outFile.close();

    
while( inFile.hasNextLine() )
        {
            token = inFile.nextLine( );      //read next token from file
            System.out.println(token);   //print value of token
        }//end while

        inFile.close();    
        

  }//end main
//end class
        
        
        
        
        
        
        
        
        

    }

    

        
        
        
        
        
        
        /*for (int loop = 1; loop <= 5; loop++)
       {
           outFile.println(loop + " Hello, World!");
       }//end for loop
// Ask for password length 
*/    
// validate password length
        
    // generate a random character in the correct character set
        
// concatenate the character to the password
        
    // write the password to the file
        

        // when the user is done, close the text file so that it can be re-opened and read



