
/**
 * The purpose of this program is to print out the number of candidates and their corresponding
 votes using an array. This program also uses replacement methods to replace names and vote counts along with 
 insertion and deletion methods.
 * @author
 * @version (2/10/23)
 */

public class ElectionTesterV5
{
     public static void main(String[]args){
         Candidate[] candidate = new Candidate[5];
        candidate[0] = new Candidate("John Lee",1891);
        candidate[1] = new Candidate("Mary Kate",121);
        candidate[2] = new Candidate("Sam Irwin",2041);
        candidate[3] = new Candidate("Dior Mae",321);
        candidate[4] = new Candidate("Laila Moor",9864);
         
    System.out.println("Original Results:");
    System.out.println("______________________");
    System.out.println();
//printVotes(c);
printData(candidate);
System.out.println();
System.out.println("The total number of votes is "+ getVoteTotal(candidate)+"\n");

System.out.println("<<In position 3, add George Jacobs, 856 votes>>");
insertCandidatePosition(candidate,3,"George Jacobs",856);
printData(candidate);
System.out.println("The total number of votes is "+ getVoteTotal(candidate)+"\n");


System.out.println("<<Before Dior Mae, add Josh Rizz, 698 votes>>");
insertCandidateName(candidate,"Dior Mae","Josh Rizz",698);
printData(candidate);
System.out.println("The total number of votes is "+ getVoteTotal(candidate)+"\n");
//
System.out.println("<<Delete Position 3>>");
deleteByLoc(candidate,3);
printData(candidate);
System.out.println("The total number of votes is "+ getVoteTotal(candidate)+"\n");

System.out.println("<<Delete Sam Irwin>>");
deleteByName(candidate,"Sam Irwin");
printData(candidate);
System.out.println("The total number of votes is "+ getVoteTotal(candidate)+"\n");


       
}   
public static void insertCandidatePosition(Candidate[] candidate, int location, String addName, int addVotes)
    {
       for(int index = candidate.length - 1; index > location; index--)
       if(candidate[index] != null){
          candidate[index] = candidate[index-1];
       candidate[location] = new Candidate(addName, addVotes);
    }
    }

    public static void insertCandidateName(Candidate[] candidate, String findName, String addName, int addVotes)
    {
        int location = 0;
        for(int index = 0; index < candidate.length; index++)
            if(candidate[index].getName().equals(findName)&&(candidate[index] != null))
                location = index;
        for(int index = candidate.length - 1; index > location; index--)
            if(candidate[index] != null)
            candidate[index] = candidate[index-1];

        candidate[location] = new Candidate(addName, addVotes);
    }
public static void deleteByLoc(Candidate[] candidate, int location)
{
if ((location > 0) && (location < candidate.length)){
for(int index = location; index < candidate.length-1; index++){
candidate[index] = candidate[index + 1];
candidate[candidate.length-1] = null;
}
}

}

public static void deleteByName(Candidate[] candidate, String name)
{
int location = 0;
int index;

for(index = 0; index < candidate.length; index++)
{
if((candidate[index] != null) && (candidate[index].getName().equals(name)))
{
location = index;
break;
}
else if(candidate[index] == null)
{
location = -1;
break;
}
}
if ((index != candidate.length) && (location >= 0))
{
for(index = location; index < candidate.length -1; index++)
candidate[index] = candidate[index + 1];
candidate[candidate.length-1] = null;
}
}


    public static void printVotes(Candidate[] candidate){
    for(int i = 0; i < candidate.length; i++){
    if(candidate[i] != null){
           System.out.println(candidate[i]);}
        }
} 
    public static int getVoteTotal(Candidate[] candidate){
        int sum=0;
    for(int i = 0; i < candidate.length; i++){
        if(candidate[i] != null)
        sum += candidate[i].getVotes();
    }
         return sum;
     }
     public static void printData(Candidate[] candidate){
     System.out.println("Candidate           Votes Received             % of Total Votes");
    System.out.println("=================================================================");
     
        for(int i = 0; i < candidate.length; i++){
            if(candidate[i] != null){
      System.out.printf("%-15s               %-5d                %-2.2f\n", 
            candidate[i].getName(), candidate[i].getVotes(), ((double)candidate[i].getVotes() / getVoteTotal(candidate)) * 100);
        }
    }
}
public static void changeName(Candidate[] candidate, String find, String replace)
{
 for(int i = 0; i < candidate.length; i++){
if(candidate[i].getName().equals(find)&&(candidate[i] != null)){
candidate[i].setName(replace);
}
}
}
public static void changeVotes(Candidate[] candidate,int find, int replace)
{
 for(int i = 0; i < candidate.length; i++){
if(candidate[i].getVotes()==find&&(candidate[i] != null)){
candidate[i].setVotes(replace);
}
}
}

public static void changeNameVotes(Candidate[] candidate, String findName, String replaceName, int findVotes, int replaceVotes)
{
for(int i = 0; i < candidate.length; i++){
if(candidate[i].getName().equals(findName)&&(candidate[i] != null)){
candidate[i].setName(replaceName);
}
if(candidate[i].getVotes()==findVotes&&(candidate[i] != null)){
candidate[i].setVotes(replaceVotes);
}
}
}

}


