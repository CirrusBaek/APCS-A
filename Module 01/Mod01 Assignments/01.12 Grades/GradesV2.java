
/**
 * This program will calculate the total points and average grade each time a new test score is added.
 *
 * @author 
 * @version 
 */
public class GradesV2
{
   public static void main(String[] args){
int numTests = 0;      //counts number of tests
int testGrade = 0;     //individual test grade
int totalPoints = 0;   //total points for all tests
double average = 0.0;  //average grade

testGrade=95;
numTests++;
totalPoints+=testGrade;
average=((double)totalPoints/numTests);
System.out.println("Test #"+numTests +"   Test Grade: "+testGrade+"   Total Points: "+totalPoints+"    Average Score: "+average);
System.out.println();

testGrade=73;
numTests++;
totalPoints+=testGrade;
average=((double)totalPoints/numTests);
System.out.println("Test #"+numTests +"   Test Grade: "+testGrade+"   Total Points: "+totalPoints+"   Average Score: "+average);
System.out.println();

testGrade=91;
numTests++;
totalPoints+=testGrade;
average=((double)totalPoints/numTests);
System.out.println("Test #"+numTests +"   Test Grade: "+testGrade+"   Total Points: "+totalPoints+"   Average Score: "+average);
System.out.println();

testGrade=82;
numTests++;
totalPoints+=testGrade;
average=((double)totalPoints/numTests);
System.out.println("Test #"+numTests +"   Test Grade: "+testGrade+"   Total Points: "+totalPoints+"   Average Score: "+average);  
System.out.println();

testGrade=89;
numTests++;
totalPoints+=testGrade;
average=((double)totalPoints/numTests);
System.out.println("Test #"+numTests +"   Test Grade: "+testGrade+"   Total Points: "+totalPoints+"   Average Score: "+average);   
System.out.println();

testGrade=100;
numTests++;
totalPoints+=testGrade;
average=((double)totalPoints/numTests);
System.out.println("Test #"+numTests +"   Test Grade: "+testGrade+"   Total Points: "+totalPoints+"   Average Score: "+average); 
System.out.println();

testGrade=76;
numTests++;
totalPoints+=testGrade;
average=((double)totalPoints/numTests);
System.out.println("Test #"+numTests +"   Test Grade: "+testGrade+"   Total Points: "+totalPoints+"   Average Score: "+average);       
System.out.println();

testGrade=99;
numTests++;
totalPoints+=testGrade;
average=((double)totalPoints/numTests);
System.out.println("Test #"+numTests +"   Test Grade: "+testGrade+"   Total Points: "+totalPoints+"   Average Score: "+average); 
System.out.println();

testGrade=54;
numTests++;
totalPoints+=testGrade;
average=((double)totalPoints/numTests);
System.out.println("Test #"+numTests +"   Test Grade: "+testGrade+"   Total Points: "+totalPoints+"   Average Score: "+average);   
       

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
   }
}
