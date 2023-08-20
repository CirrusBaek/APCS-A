
/**
 * The purpose of this program is to print out the number of candidates and their corresponding
 votes using an arraylist. This program also uses replacement methods to replace names and vote counts along with 
 insertion and deletion methods.
 *
 * @author 
 * @version (2/10/23)
 */
import java.util.ArrayList;
public class ElectionTesterV6
{
     public static void main(String[]args){
         
  ArrayList<Candidate>c=new ArrayList<Candidate>();
 c.add(new Candidate("John Lee",1891));
 c.add(new Candidate("Mary Kate",121));  
 c.add(new Candidate("Sam Irwin",2041));
 c.add(new Candidate("Dior Mae",321));    
 c.add(new Candidate("Laila Moor",9864));
         
    System.out.println("Original Results:");
    System.out.println("______________________");
    System.out.println();
//printVotes(c);
printData(c);
System.out.println();
System.out.println("The total number of votes is "+ getVoteTotal(c)+"\n");

System.out.println("<<In position 3, add George Jacobs, 856 votes>>");
insertCandidatePosition(c,3,"George Jacobs",856);
printData(c);
System.out.println("The total number of votes is "+ getVoteTotal(c)+"\n");


System.out.println("<<Before Dior Mae, add Josh Rizz, 698 votes>>");
insertCandidateName(c,"Dior Mae","Josh Rizz",698);
printData(c);
System.out.println("The total number of votes is "+ getVoteTotal(c)+"\n");
//
System.out.println("<<Delete Position 4>>");
deleteByLocation(c,4);
printData(c);
System.out.println("The total number of votes is "+ getVoteTotal(c)+"\n");

System.out.println("<<Delete Sam Irwin>>");
deleteByName(c,"Sam Irwin");
printData(c);
System.out.println("The total number of votes is "+ getVoteTotal(c)+"\n");


       
}   
public static void insertCandidatePosition(ArrayList<Candidate> data, int location, String addName, int addVotes)
    {
        data.add(location, new Candidate(addName, addVotes));
    }

    public static void insertCandidateName(ArrayList<Candidate> data, String find, String addName, int addVotes)
    {
        int location = 0;
        // find location of item you want to insert before
        for(int index = 0; index < data.size(); index++)
            if(data.get(index).equals(find))
                location = index;
        // insert item into ArrayList
        data.add(location, new Candidate(addName, addVotes));
    }
    
    public static void deleteByLocation(ArrayList<Candidate> data, int location)
{
data.remove(location);
}
public static void deleteByName(ArrayList<Candidate> data, String findName)
{
int location = 0;
int index;
for(index = 0; index < data.size(); index++)
{
if(data.get(index).getName().equals(findName))
{
location = index;
break;
}
}
if(index != data.size())
data.remove(location);
}
    
    
        public static void printVotes(ArrayList<Candidate> data){
    for(Candidate t : data){
        System.out.printf(t.toString());
    } 
} 
    public static int getVoteTotal(ArrayList<Candidate> data){
        int sum=0;
    for(Candidate t : data){
        sum += t.getVotes();
    }
         return sum;
     }
     public static void printData(ArrayList<Candidate> data){
     System.out.println("Candidate           Votes Received             % of Total Votes");
     System.out.println("=================================================================");
        for(Candidate t : data){
      System.out.printf("%-15s               %-5d                %-2.2f\n", 
            t.getName(), t.getVotes(), ((double)t.getVotes() / getVoteTotal(data)) * 100);
    }
}
public static void changeName(ArrayList<Candidate> data, String find, String replace)
{
for(int index = 0; index < data.size(); index++)
if(data.get(index).getName().equals(find)){
data.get(index).setName(replace);
}
}
public static void changeVotes(ArrayList<Candidate> data, int find, int replace)
{
for(int index = 0; index < data.size(); index++){
if(data.get(index).getVotes()==find){
data.get(index).setVotes(replace);
}
}
}

public static void changeNameVotes(ArrayList<Candidate> data, String findName, String replaceName, int findVotes, int replaceVotes)
{
for(int index = 0; index < data.size(); index++){
if(data.get(index).getVotes()==findVotes){
data.get(index).setVotes(replaceVotes);
}
if(data.get(index).getName().equals(findName)){
data.get(index).setName(replaceName);
}
}
}

}


