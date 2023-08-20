
/**
 * This is the implementation class which contains the methods to calculate height in inches and name length.
 *
 * @author 
 * @version (10/16/22)
 */
public class StudentV3
{
   
    public StudentV3()
    {
       
    }
    public double convertInches(double studFeet){
        double inches=(int)(100.0*studFeet*12)/100.0;
        return inches;
    }
   
    public int findLength(String name){
        return name.length();
       
        
    }
}