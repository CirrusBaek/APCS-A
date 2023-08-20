
/**
 * The goal of this program is to calculate the probability of whether a family will have 2 boys, 2 girls, or 1 girl and 1 boy 
 * by reading data from a text file.
 *
 * @author 
 * @version 9/27/22
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
   public static void main(String[]args)throws IOException
   {
       int twoBoys=0;
       int twoGirls=0;
       int boyAndGirl=0;
       int totalPop=0;
       int counter=0;
       double twoBoysProb=0.0;
       double twoGirlsProb=0.0;
       double boyAndGirlProb=0.0;
       
        String token = "";
        File fileName = new File("familyMembers.txt");
        Scanner inFile = new Scanner(fileName);

        while( inFile.hasNext() )
        {
            token = inFile.next( );      
            if(token.equals("BB")){
                twoBoys++;
                counter++;
            }else if(token.equals("BG")){
                boyAndGirl++;
                counter++;
            }else if(token.equals("GB")){
                boyAndGirl++;
                counter++;
            }else if(token.equals("GG")){
                twoGirls++;
                counter++;
            }
        }//end while
        inFile.close(); 
        totalPop=counter;
        
    twoBoysProb= (int)(1000*(double)(twoBoys)/totalPop)/10.0;  
    twoGirlsProb=(int)(1000*(double)(twoGirls)/totalPop)/10.0;
    boyAndGirlProb=(int)(1000*(double)(boyAndGirl)/totalPop)/10.0;
        
        System.out.println("Composition statistics for families with 2 children.");
        System.out.println();
        System.out.println("Total number of families: "+totalPop);
        System.out.println();
        System.out.println("Number of families with");
        System.out.println("\t\t2 boys: "+twoBoys+" represents: "+twoBoysProb+"%");
        System.out.println("\t\t2 girls: "+twoGirls+" represents: "+twoGirlsProb+"%");
        System.out.println("\t1 boy and 1 girl: "+boyAndGirl+" represents: "+boyAndGirlProb+"%");
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
   }
}
