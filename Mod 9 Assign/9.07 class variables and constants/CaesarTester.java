
/**
 * The purpose of this program is to create a caesar cipher using static methods
 * and oop concepts
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CaesarTester
{
        public static void showMenu(){
           
        Scanner in=new Scanner(System.in);
        System.out.print("Would you like to Decrypt(D), Encrypt(E) a Message, or Quit(Q) ?: ");
        
        String userChoice=in.nextLine();
        if (userChoice.equalsIgnoreCase("E")) {
            System.out.print("Shift to Use(0-25): ");
            String shift = in.nextLine();
            int shiftInt = Integer.parseInt(shift);
            Encryption c = new Encryption(shiftInt);
            c.printAlphabet();
            
            System.out.println("Message to Encrypt: ");
            String message = in.nextLine();
            Encryption cse = new Encryption(shiftInt, message);
            cse.encryptMessage();
            cse.printEncryptedMessage();
            showMenu();
        } else if (userChoice.equalsIgnoreCase("D")) {
            System.out.print("Shift to Use(0-25): ");
            String shift = in.nextLine();
            int shiftInt = Integer.parseInt(shift);
             Decryption c = new Decryption(shiftInt);
            c.printAlphabet();
            
            System.out.println("Message to Decrypt: ");
            String message = in.nextLine();
            Decryption cse = new  Decryption(shiftInt, message);
            cse.decryptData();
            cse.printDecryptedMessage();
            showMenu();
        } else if (userChoice.equalsIgnoreCase("Q")) {
            System.out.println("Goodbye.");
        } else {
            System.out.println("Error: Not a Valid Entry");
            showMenu();
        }
    
}

        public static void main(String[]args){
        
        showMenu();
        
        
    }
}
