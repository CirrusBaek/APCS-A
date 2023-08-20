
/**
 * Write a description of class CityWeatherV1 here.
 *
 * 
 * 1/15/23
 */
public class CityWeatherV1
{
    // instance variables - replace the example below with your own
    private String[] Month;
    private double[] temperature;
    private double[] precipitation;

 
    public CityWeatherV1(String month[],double temp[],double precip[])
    {
        Month=month;
        temperature=temp;
        precipitation=precip;
    }
    
   public String[] getMonth() //accessor method
     {
      return Month; 
   }
   public double[] getTemp()//accessor method
   {
      return temperature;  
   }
     public double[] getPrecip()//accessor method
   {
      return precipitation;  
   }
   
   public void setMonth(String month[]) //mutator method
   {
      Month = month;
   }
   public void setTemp(double temp[]) //mutator method
   {
      temperature=temp;
   }
   public void setPrecip(double precip[]) //mutator method
   {
     precipitation=precip;
   }
    
   
   
    public double tempAverage(double temperature[])
    {
        double sum=0.0;
        for(int index=0;index<temperature.length;index++){
            sum+=temperature[index];

    }
    return sum/temperature.length;
}
    public double precipTotal(double precipitation[])
    {
        double sum=0.0;
        for(int index=0;index<precipitation.length;index++){
            sum+=precipitation[index];
    }
    return sum;
}
public void convertC(double temperature[])
{
     for(int index=0;index<temperature.length;index++){
            temperature[index]=(int)(100.0*((temperature[index]-32)*(5.0/9)))/100.0;

    }
    
}
public void convertCm(double precipitation[])
{
     for(int index=0;index<temperature.length;index++){
            precipitation[index]=(int)(100.0*(precipitation[index]*2.54))/100.0;

    }
    
}
// method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02

}
