/**
 * Purpose:  This class defines a Student by its name and quiz scores(client class)
 *
 * @author 
 * @version < 2/13/23>
 */

public class Student
{
    // instance variables
    private int[]Scores;
    private String name;

    // Constructor for objects of class Student
    public Student(String name,int s1, int s2, int s3, int s4, int s5 )
    {
        this.name = name;
        int[]quizScores={s1,s2,s3,s4,s5};
       Scores=quizScores;
    }
    
    public String getName()
    {
        return name;
    }
//a method that takes in a quiz number as input and then returns the appropriate quiz value
//a method that sets a quiz score based on inputing a quiz number and new quiz score//
    public int[] getScores()
    {
        return Scores;
    }

    public int[] setScores(int quizNumber,int quizScore)
    {
        for(int i=0;i<Scores.length;i++){
            if(quizNumber==i+1){
                Scores[i]=quizScore;
            }
        }
        return Scores;
    }
        
    public int[] setScores(int[]scores)
    {
        for(int i=0;i<Scores.length;i++){
            Scores[i]=scores[i];
        }
        return Scores;
    }


    public void setName(String n)
    {
        name = n;
    }

    public String toString()
    {
    return String.format("%-12s %-5d %-5d %-5d %-5d %-5d%n",name,Scores[0],Scores[1],Scores[2],Scores[3],Scores[4]);
}
}
