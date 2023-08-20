
/**
 * The purpose of this program is to calculate the length of a given
student's name and convert their original height(ft) to inches using an object class and methods. 
 *
 * @author 
 * @version (10/16/22)
 */
public class StudentV3Tester
{
    public static void print(String name,int nameLength,double heightft,double heightInch){
        System.out.println("Student Name\tName Length\tHeight(ft)\tHeight(inches)");
        System.out.println("-------------------------------------------------------------");
        System.out.println(name+"\t\t"+nameLength+"\t\t"+heightft+"\t\t"+heightInch);
    }
    public static void main(String[]args){
        
     
        String name="Amy";
        double heightFeet=5.3;
        double heightInches=0.0;
        int nameLength=0;
        
        
        StudentV3 student1=new StudentV3();
        nameLength=student1.findLength(name);
        heightInches=student1.convertInches(heightFeet);
        print(name,nameLength,heightFeet,heightInches);
        
        
    }
}
