
/**
 * The goal of this program is to simulate online purchase through user input and
 * by giving the receipt.
 *
 * @author 
 * @version (9/10/22)
 */
import java.util.Scanner;
import java.util.Random;
public class BookPurchase
{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        Random r=new Random();
        
        System.out.println("Good Morning.");
        System.out.println("Please enter your first and last name: ");
        String name=in.nextLine();
        
        System.out.println("Enter today's date(mm/dd/yyyy): ");
        String date=in.nextLine();
        
        System.out.println("What book would you like to purchase?: ");
        String bookTitle=in.nextLine();
        
        System.out.println("Who is the author of the book?: ");
        String bookAuthor=in.nextLine();
        
        System.out.println("What is the price of the book?: ");
        String bookPrice=in.nextLine();
    
        System.out.println("How many books?: ");
        String bookNum=in.next();
        
        System.out.println("Enter you debit card number (#####-###-####): ");
        String debitNum=in.next();
        
        System.out.println("Enter you PIN (####): ");
        String pin=in.next();
        
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        System.out.println();
        
        //parsing book cost and quantity to calculate final cost
        double newBookPrice=Double.parseDouble(bookPrice.replace("$"," "));
        int newBookNum=Integer.parseInt(bookNum);
        double finalPrice=newBookPrice*newBookNum;
        
        //creating final name for receipt
        String firstInitial= name.substring(0,1);
        int lastIndex= name.indexOf(" ")+1;
        String lastName= name.substring(lastIndex);
        String finalName=firstInitial+".  "+lastName;
        
        //partial debit number for receipt
        String newDebitNum =debitNum.substring(9);
        
        //date for receipt
        String newDate= date.replace("/","-");
        
        // 3 digit debit number for receipt order number
        String newDebitNum2 =debitNum.substring(6,9);
        
        //generating a random character from a string
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char letter1 = alphabet.charAt(r.nextInt(alphabet.length()));
        // the r.nextInt method returns a random integer(index position) from 0 to the value of alphabet.length.
        // the charAt method takes the resulting value and finds the character at that specific index.
        char letter2 = alphabet.charAt(r.nextInt(alphabet.length()));
        
        //printing e-ticket
        System.out.println("Your e-Receipt");
        System.out.println();
        System.out.println(newDate);
        System.out.println("Order Number: "+letter1+letter2+newDebitNum2);
        System.out.println();
        
        System.out.println(finalName);
        System.out.println("Account:  #####-###"+newDebitNum);
        System.out.println("Book Name: "+bookTitle+" by "+bookAuthor);
        System.out.println("Number of Books: "+bookNum);
        System.out.println("Book Price: "+newBookPrice);
        System.out.println();
        System.out.println("$"+finalPrice+" will be debited to your account.");
        System.out.println();
        System.out.println("Thank You for your purchase!");
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        System.out.println();
        
       
        
        
    }
    
}
