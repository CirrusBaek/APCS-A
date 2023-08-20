
/**
 * The purpose of this program is to print out the number of students and their corresponding
 votes using an arraylist. This program uses replacement methods to replace names and quiz scores along with 
 insertion and deletion methods.
 *
 * @author 
 * @version (2/13/23)
 */
import java.util.*;
public class StudentTester
{
    public static void main(String[]args){
         List<Student>student = new ArrayList<Student>();
        student.add(new Student("Mary Jane",98,87,34,89,78));
        student.add(new Student("John Lee",100,77,97,82,66));
        student.add(new Student("Kate Bush",99,85,67,91,68));
        student.add(new Student("Nick Kull",90,87,70,89,88));
        student.add(new Student("Laila Koss",88,74,96,92,83));
         System.out.println("Student      Q1    Q2    Q3    Q4    Q5");
        System.out.println("=================================================================");
        printStudent(student);
        System.out.println();
        
        System.out.println("<<Replacing Nick Kull with Adam Boss>>");
        replaceName(student,"Nick Kull","Adam Boss");
        printStudent(student);
        System.out.println();
        
         System.out.println("<<Replacing Laila Koss with John Burr,98,32,13,34,12>>");
        replaceStudent(student,"Laila Koss","John Burr",98,32,13,34,12);
        printStudent(student);
        System.out.println();
        
        System.out.println("<Replacing John Lee quiz 2 grade as 89>>");
        replaceQuiz(student,"John Lee",2,89);
        printStudent(student);
        
        System.out.println("<<Inserting Joe Mama before Adam Boss, scores:56,98,96,24,78>>");
       insertStudentName(student,"Adam Boss","Joe Mama",56,98,96,24,78);
        printStudent(student);
        System.out.println();
        
        System.out.println("<<Deleting Mary Jane>>");
       deleteByName(student,"Mary Jane");
        printStudent(student);
        
         
        
        
    }
    public static void printStudent(List<Student>student) 
    {
        for(Student newStudent: student)
            System.out.printf(newStudent.toString());
    }
      
public static void replaceQuiz(List<Student>scores,String name, int quizNumber,int quizScore){
      for(int index = 0; index < scores.size(); index++){
          if(scores.get(index).getName().equals(name)){
          scores.get(index).setScores(quizNumber,quizScore);
          }
          }
        }

    public static void replaceName(List<Student>scores,String find, String replace){
       for(int index = 0; index < scores.size(); index++)
if(scores.get(index).getName().equals(find)){
scores.get(index).setName(replace);
    }
}
 public static void replaceStudent(List<Student>scores,String find, String replace,int s1,int s2,int s3, int s4,int s5){
     int[]Scores={s1,s2,s3,s4,s5};
     for(int index = 0; index < scores.size(); index++)
    if(scores.get(index).getName().equals(find)){
     scores.get(index).setName(replace);
      scores.get(index).setScores(Scores);
    }
     
    }
    public static void insertStudentName(List<Student>scores, String find, String replace, int s1,int s2,int s3, int s4,int s5)
    {
        int location = 0;
        int index=0;
        for(index = 0; index < scores.size(); index++)
            if(scores.get(index).getName().equals(find))
                location = index;
        scores.add(location, new Student(replace,s1,s2,s3,s4,s5));
    }
    public static void deleteByName(List<Student>scores, String findName)
{
int location = 0;
int index;
for(index = 0; index < scores.size(); index++)
{
if(scores.get(index).getName().equals(findName))
{
location = index;
break;
}
}
if(index != scores.size())
scores.remove(location);
}
    }
       

    

