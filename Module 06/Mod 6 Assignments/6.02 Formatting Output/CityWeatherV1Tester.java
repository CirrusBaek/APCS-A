
/**
 * This project displays the average temperature and precipitation for a selected city/state by using arrays.
 *
 * 
 * 1/15/23
 */
import java.util.Scanner;
public class CityWeatherV1Tester
{
public static void main(String[]args){
 Scanner in=new Scanner(System.in);
 System.out.println("Choose the temperature scale(F= Fahrenheit,C= Celsius):");
 String tempScale=in.nextLine();
 System.out.println("Choose the precipitation scale(i= inches,c= centimeters):");
 String precipScale=in.nextLine();
 
String city="Key West";
String state="Florida";
//String city="Tallahassee";
String months[]={"Jan", "Feb","Mar", "Apr", "May", "Jun", "Jul", "Aug","Sept", "Oct", "Nov","Dec"};
double tempF[]={70.3,70.8,73.8,77.0,80.7,83.4,84.5,84.4,83.4,80.2,76.3,72.0}; //uncomment this when testing other data set
double precipInch[]={2.2,1.5,1.9,2.1,3.5,4.6,3.3,5.4,5.5,4.3,2.6,2.1};////uncomment this when testing other data set

//double tempF[]={51.8,54.8,61.1,66.4,74.4,80.4,82.4,82.1,78.9,69.1,60.4,53.7}; //<------extra data
//double precipInch[]={5.4,4.6,6.5,3.6,5.0,6.9,8.0,7.0,5.0,3.3,3.9,4.1};
        String tempLabel = "(F)";    
        String precipLabel = "(in.)";
        
    CityWeatherV1 city1=new CityWeatherV1(months,tempF,precipInch);
         if (tempScale.equalsIgnoreCase("C")){
            tempLabel="(C)";
            city1.convertC(tempF);
        }
        if(precipScale.equalsIgnoreCase("c")){
            precipLabel="(Cm.)";
            city1.convertCm(precipInch);
        }
        double average=city1.tempAverage(city1.getTemp());
        double totalPrecip=city1.precipTotal(city1.getPrecip());
        System.out.printf("%27s%n","Climate Data");
        System.out.printf("%35s%n", "Location: " + city + ", " + state + "\n");
        System.out.printf("%5s %15s %s %15s %s %n","Month","Temperature",tempLabel,"Precipitation",precipLabel);
        System.out.printf("**************************************************************%n");
 
        for(int i=0;i<months.length;i++){
            System.out.printf("%-5s%16.1f%19.1f%n",months[i],tempF[i],precipInch[i]);
        }
        System.out.printf("*****************************************************************%n");
        System.out.printf("%7sAverage: %-10.1f Annual: %.1f","",average,totalPrecip);
        
        
        
        
    }
   
}
