/**
 * Starter code for the Hurricane Tester
 * APCS Team 2020
 * Author: 
 *purpose: to scan hurricane data from a txt file and store it in an arraylist based 
 *on the year range prompted from the user.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class HurricaneTester

{
    public static void main(String[] args) throws IOException
    {
        //read data from text file & put in an array
        File fileName = new File("HurricaneData.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;

        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();


        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];

        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        double mphInKnots = 1.5077;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            windSpeeds[index]*=mphInKnots;
            names[index] = inFile.next();
            index++;
        }
        inFile.close();
        int[] category=new int[numValues];
        int category1 = 0;
        int category2 = 0;
        int category3 = 0;
        int category4 = 0;
        int category5 = 0;
        
        Scanner in=new Scanner(System.in);
        System.out.println("From which year do you want hurricane data?(1985-2019): From ");
        int year1=in.nextInt();
        System.out.println("Till which year do you want hurricane data?(1985-2019): Till ");
        int year2=in.nextInt();
        //convert the windspeed, determine categories, calculate sums
        ArrayList<Hurricane> hurricane = new ArrayList<Hurricane>();
        double windSpeedSum=0;
        double windSpeedAverage=0;
        
        double pressureSum=0;
        double pressureAverage=0;
        
        double categoryAverage = 0;
        double categorySum=0;
        double pressureMax=Double.MIN_VALUE;
double pressureMin=Double.MAX_VALUE;
double windSpeedMax=Double.MIN_VALUE;
double windSpeedMin=Double.MAX_VALUE;
double categoryMax=Double.MIN_VALUE;
double categoryMin=Double.MAX_VALUE;
        for(int i = 0; i < years.length; i++){
            if((years[i]>=year1)&&(years[i]<=year2)){
            if (windSpeeds[i] > 74 && windSpeeds[i] < 95) {
                category[i] = 1;
                category1++;
            }
            else if (windSpeeds[i] > 96 && windSpeeds[i] < 110) {
                category[i] = 2;
                category2++;
            }
            else if (windSpeeds[i] > 111 && windSpeeds[i] < 129) {
                category[i] = 3;
                category3++;
            }
            else if (windSpeeds[i] > 130 && windSpeeds[i] < 156) {
                category[i] = 4;
                category4++;
            }
            else if (windSpeeds[i] > 157) {
                category[i] = 5;
                category5++;
            }

        
            if (pressures[i] >pressureMax) {
                pressureMax = pressures[i];
            }
            if (pressures[i] <pressureMin) {
                pressureMin = pressures[i];
            }
        
            if (windSpeeds[i] > windSpeedMax) {
                 windSpeedMax = windSpeeds[i];
            }
             if (windSpeeds[i]<windSpeedMin) {
                windSpeedMin = windSpeeds[i];
            }
        
            if (category[i] >categoryMax) {
                categoryMax =category[i];
            }
            if(category[i]<categoryMin){
                categoryMin=category[i];
            }
        
        hurricane.add(new Hurricane(years[i],names[i],months[i],category[i],pressures[i],windSpeeds[i]));
            categorySum+= category[i];
        windSpeedSum += windSpeeds[i];
        pressureSum+= pressures[i];
         categoryAverage=categorySum/hurricane.size();
         pressureAverage=pressureSum/hurricane.size();
         windSpeedAverage=windSpeedSum/hurricane.size();
        }
    }
        
        System.out.println("                      Hurricanes "+year1+"-"+year2);
        System.out.println();
        System.out.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        System.out.println("=====================================================================");
        for (Hurricane data:hurricane) {
            System.out.println(data);
        }
         System.out.println("=====================================================================");
        System.out.printf("%s%13s%10.1f%16.1f%18.2f%n","    ","Average",categoryAverage,pressureAverage,windSpeedAverage);
        System.out.printf("%s%13s%10.0f%16.0f%18.2f%n","    ","Minimum",categoryMin,pressureMin,windSpeedMin);
        System.out.printf("%s%13s%10.0f%16.0f%18.2f%n","    ","Maximum",categoryMax,pressureMax,windSpeedMax);
        System.out.println("  Summary of Categories:");
        System.out.printf("%10s %4d%n","Cat 1:",category1);
        System.out.printf("%10s %4d%n","Cat 2:",category2);
        System.out.printf("%10s %4d%n","Cat 3:",category3);
        System.out.printf("%10s %4d%n","Cat 4:",category4);
        System.out.printf("%10s %4d%n","Cat 5:",category5);
       
        
    }

}